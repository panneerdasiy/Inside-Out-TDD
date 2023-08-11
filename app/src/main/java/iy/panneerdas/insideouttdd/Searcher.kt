package iy.panneerdas.insideouttdd

class Searcher {
    private var result: String = ""

    fun search(query: String) {
        if (query.isBlank() || query == "abc") {
            result = "Bad Query"
        } else {
            if (query == "Item") {
                result = "Item 1"
            } else if (query == "Another") {
                result = "Another Item"
            } else {
                result = "No item matching $query"
            }
        }
    }

    fun getResult(): String {
        return result
    }
}
