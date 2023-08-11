package iy.panneerdas.insideouttdd

import org.junit.Assert.assertEquals
import org.junit.Test

class SearcherTest {
    @Test
    fun findMatch() {
        val sut = Searcher()

        sut.search("Item")

        assertEquals("Item 1", sut.getResult())
    }

    @Test
    fun findAnotherMatch() {
        val sut = Searcher()

        sut.search("Another")

        assertEquals("Another Item", sut.getResult())
    }

    @Test
    fun findNoMatch() {
        val sut = Searcher()

        sut.search("Coffee")

        assertEquals("No item matching Coffee", sut.getResult())
    }

    @Test
    fun blankQuery() {
        val sut = Searcher()

        sut.search("")

        assertEquals("Bad Query", sut.getResult())
    }
}