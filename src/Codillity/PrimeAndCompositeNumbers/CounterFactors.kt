fun main() {

    println(solution(0))
}

private fun solution(N: Int): Int {
    // D => N =D * M
    // M = 4   (24 = 6*4)
    val factors = (1..N/2).filter { N % it == 0 } + N

    return factors.count()
}
