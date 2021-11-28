package br.com.dev

object Main {
    //
    fun climbingLeaderboard(ranked: Array<Int>, player: Array<Int>): Array<Int> {
        val distinct = ranked.distinct()
        return player.map { score ->
            var result = -1
            var start = 0
            var end = distinct.size - 1
            while (start <= end) {
                val medium = (start + end) / 2
                if (score > distinct[medium]) {
                    result = medium
                    end = medium - 1
                } else if (score < distinct[medium]) {
                    start = medium + 1
                    result = start
                } else {
                    result = medium
                    break
                }
            }
            result + 1
        }.toTypedArray()
    }
}
