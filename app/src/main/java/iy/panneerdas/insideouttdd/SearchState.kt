package iy.panneerdas.insideouttdd

sealed class SearchState {
    data class Match(val value: String) : SearchState()
    data class NoMatchFor(val value: String) : SearchState()
    object BadQuery : SearchState()
}
