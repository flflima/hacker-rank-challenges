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

    @Test
    fun `given time 2h01 should return "one minute past two"`() {
        val timeInWords = timeInWords(2, 1)

        assertThat(timeInWords).isEqualTo("one minute past two")
    }

    @Test
    fun `given time 5h10 should return "ten minutes past five"`() {
        val timeInWords = timeInWords(5, 10)

        assertThat(timeInWords).isEqualTo("ten minutes past five")
    }

    @Test
    fun `given time 6h15 should return "quarter past six"`() {
        val timeInWords = timeInWords(6, 15)

        assertThat(timeInWords).isEqualTo("quarter past six")
    }

    @Test
    fun `given time 6h28 should return "twenty eight minutes past six"`() {
        val timeInWords = timeInWords(6, 28)

        assertThat(timeInWords).isEqualTo("twenty eight minutes past six")
    }

    @Test
    fun `given time 3h30 should return "half past three"`() {
        val timeInWords = timeInWords(3, 30)

        assertThat(timeInWords).isEqualTo("half past three")
    }
}