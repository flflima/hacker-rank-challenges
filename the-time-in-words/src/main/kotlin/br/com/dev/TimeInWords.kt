package br.com.dev

fun timeInWords(hour: Int, minutes: Int): String {
    var hourString = ""
    var minutesString = ""
    if (hour == 1) {
        hourString = "one"
    } else if (hour == 5) {
        hourString = "five"
    }
    if (minutes == 0) {
        minutesString = "o'clock"
    }
    return "$hourString $minutesString"
}