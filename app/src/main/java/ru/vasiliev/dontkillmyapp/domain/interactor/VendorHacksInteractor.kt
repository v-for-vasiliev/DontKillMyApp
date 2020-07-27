package ru.vasiliev.dontkillmyapp.domain.interactor

import io.reactivex.rxjava3.core.CompletableSource
import io.reactivex.rxjava3.core.ObservableTransformer
import ru.vasiliev.dontkillmyapp.data.util.SchedulerProvider
import ru.vasiliev.dontkillmyapp.di.scope.AppScope
import ru.vasiliev.dontkillmyapp.domain.repository.VendorHacksRepository
import ru.vasiliev.dontkillmyapp.ui.vendorhacks.mvi.VendorHacksAction.LoadHacksAction
import ru.vasiliev.dontkillmyapp.ui.vendorhacks.mvi.VendorHacksResult.LoadHacksResult
import javax.inject.Inject

@AppScope
class VendorHacksInteractor @Inject constructor(
    private val repository: VendorHacksRepository,
    private val schedulerProvider: SchedulerProvider
) {

    private val loadHacksProcessor =
        ObservableTransformer<LoadHacksAction, LoadHacksResult> { actions ->
            actions.flatMap {
                repository.loadHacks()
                    .map { hacks -> LoadHacksResult.Success(hacks) }
                    .cast(LoadHacksResult::class.java)
                    .onErrorReturn(LoadHacksResult::Failure)
                    .subscribeOn(schedulerProvider.io())
                    .observeOn(schedulerProvider.ui())
                    .startWith(CompletableSource { LoadHacksResult.Loading })
            }
        }
}