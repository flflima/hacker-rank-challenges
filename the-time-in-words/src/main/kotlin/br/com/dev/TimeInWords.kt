package br.com.dev

val hourStr = mapOf(
    1 to "one",
    2 to "two",
    3 to "three",
    4 to "four",
    5 to "five",
    6 to "six",
    7 to "seven",
    8 to "eight",
    9 to "nine",
    10 to "ten",
    11 to "eleven",
    12 to "twelve"
)

fun timeInWords(hour: Int, minutes: Int): String {
    var minutesString = ""
    if (minutes == 0) {
        minutesString = "o'clock"
    }
    return "${hourStr[hour]} $minutesString"
}