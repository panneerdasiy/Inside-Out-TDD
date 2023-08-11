package iy.panneerdas.insideouttdd

class Searcher {
    private var result: String = ""

    fun search(query: String) {
        if (query == "Item 1") {
            result = "Item 1"
        } else if (query == "Another") {
            result = "Another Item"
        }
    }

    fun getResult(): String {
        return result
    }
}
