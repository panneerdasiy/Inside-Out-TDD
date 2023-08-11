package iy.panneerdas.insideouttdd

import androidx.lifecycle.MutableLiveData

class Searcher {
    private val searchStateLiveData = MutableLiveData<SearchState>()

    fun search(query: String) {
        if (query.isBlank() || query == "abc") {
            searchStateLiveData.value = SearchState.BadQuery
        } else {
            if (query == "Item") {
                searchStateLiveData.value = SearchState.Match("Item 1")
            } else if (query == "Another") {
                searchStateLiveData.value = SearchState.Match("Another Item")
            } else {
                searchStateLiveData.value = SearchState.NoMatchFor(query)
            }
        }
    }

    fun searchState(): SearchState? {
        return searchStateLiveData.value
    }
}
