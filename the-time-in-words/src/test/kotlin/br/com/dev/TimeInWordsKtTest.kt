package br.com.dev

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TimeInWordsKtTest {

    @Test
    fun `given time 1h00 should return "one o'clock"`() {
        val timeInWords = timeInWords(1, 0)

        assertThat(timeInWords).isEqualTo("one o'clock")
    }

    @Test
    fun `given time 5h00 should return "five o'clock"`() {
        val timeInWords = timeInWords(5, 0)

        assertThat(timeInWords).isEqualTo("five o'clock")
    }
}