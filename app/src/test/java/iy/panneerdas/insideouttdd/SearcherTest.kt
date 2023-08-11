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
}