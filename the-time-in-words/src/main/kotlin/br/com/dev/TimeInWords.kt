package br.com.dev

val numerals = mapOf(
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
    12 to "twelve",
    13 to "thirteen",
    14 to "fourteen",
    15 to "fifteen",
    16 to "sixteen",
    17 to "seventeen",
    18 to "eighteen",
    19 to "nineteen",
    20 to "twenty",
    30 to "thirty",
    40 to "forty",
    50 to "sixty",
    60 to "fifty",
)

fun timeInWords(hour: Int, minutes: Int): String {
    val hourStr = numerals[hour]
    val minuteStr = toMinutesString(minutes)
    if (minutes == 1) return "$minuteStr minute past $hourStr"
    if (minutes == 30) return "half past $hourStr"
    if (minutes == 15) return "quarter past $hourStr"
    if (minutes in 2..14 || minutes in 16..29) return "$minuteStr minutes past $hourStr"
    return "$hourStr o'clock"
}

fun toMinutesString(minutes: Int): String {
    if (minutes == 0) return ""
    if (minutes in 1..19) return numerals[minutes]!!
    if (minutes % 10 == 0) return numerals[minutes]!!

    val minuteUnity = minutes % 10
    val minuteDozen = minutes - minuteUnity
    return "${numerals[minuteDozen]} ${numerals[minuteUnity]}"
}
