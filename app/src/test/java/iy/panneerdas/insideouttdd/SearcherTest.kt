package iy.panneerdas.insideouttdd

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class SearcherTest {

    @get:Rule
    val instantTaskExecutorRule = InstantTaskExecutorRule()

    private lateinit var sut: Searcher

    @Before
    fun init() {
        sut = Searcher()
    }

    @Test
    fun findMatch() {
        sut.search("Item")

        assertEquals(SearchState.Match("Item 1"), sut.searchState())
    }

    @Test
    fun findAnotherMatch() {
        sut.search("Another")

        assertEquals(SearchState.Match("Another Item"), sut.searchState())
    }

    @Test
    fun findNoMatch() {
        sut.search("Coffee")

        assertEquals(SearchState.NoMatchFor("Coffee"), sut.searchState())
    }

    @Test
    fun blankQuery() {
        sut.search("")

        assertEquals(SearchState.BadQuery, sut.searchState())
    }

    @Test
    fun disallowedQuery() {
        sut.search("abc")

        assertEquals(SearchState.BadQuery, sut.searchState())
    }
}