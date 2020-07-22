package ru.vasiliev.architecturesandbox.core.mvi

import io.reactivex.rxjava3.core.Observable

interface MviViewModel<I : MviIntent, S : MviViewState> {
    fun process(intents: Observable<I>)
    fun states(viewState: S)
}