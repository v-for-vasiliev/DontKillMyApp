package ru.vasiliev.dontkillmyapp.core.mvi

import io.reactivex.rxjava3.core.Observable

interface MviViewModel<I : MviIntent, S : MviViewState> {
    fun processIntents(intents: Observable<I>)
    fun states(viewState: S)
}