fun main() {

    println(solution(intArrayOf(2,1,1,2,3,1)))
}

private fun solution(A: IntArray): Int {
    println(A.map{it}.distinct().count())
    return A.toList().stream().distinct().count().toInt()
}
