package iy.panneerdas.insideouttdd

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import org.junit.Assert.assertEquals
import org.junit.Rule
import org.junit.Test

class SearcherTest {

    @get:Rule
    val instantTaskExecutorRule = InstantTaskExecutorRule()

    @Test
    fun findMatch() {
        val sut = Searcher()

        sut.search("Item")

        assertEquals(SearchState.Match("Item 1"), sut.searchState())
    }

    @Test
    fun findAnotherMatch() {
        val sut = Searcher()

        sut.search("Another")

        assertEquals(SearchState.Match("Another Item"), sut.searchState())
    }

    @Test
    fun findNoMatch() {
        val sut = Searcher()

        sut.search("Coffee")

        assertEquals(SearchState.NoMatchFor("Coffee"), sut.searchState())
    }

    @Test
    fun blankQuery() {
        val sut = Searcher()

        sut.search("")

        assertEquals(SearchState.BadQuery, sut.searchState())
    }

    @Test
    fun disallowedQuery() {
        val sut = Searcher()

        sut.search("abc")

        assertEquals(SearchState.BadQuery, sut.searchState())
    }
}