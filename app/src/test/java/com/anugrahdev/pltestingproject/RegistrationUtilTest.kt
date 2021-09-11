package com.anugrahdev.pltestingproject

import org.junit.Assert.*

import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class RegistrationUtilTest {

    @Before
    fun setUp() {
    }

    @After
    fun tearDown() {
    }

    @Test
    fun `test login empty username and password return false`(){
        val result = RegistrationUtil.validateLoginInput(
            username = "",
            password = ""
        )
        assertFalse(result)
    }

    @Test
    fun `test login return true`(){
        val result = RegistrationUtil.validateLoginInput(
            username = "anugrahdev",
            password = "12345678"
        )
        assertTrue(result)
    }
}