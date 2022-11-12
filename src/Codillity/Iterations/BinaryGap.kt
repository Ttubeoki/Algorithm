fun main() {
    println("Hello World")

    val N = arrayListOf(1234,529,33,52)
    N.forEach {
        println(solution(it))
    }
}
private fun solution(N: Int): Int {
    val binary = N.toString(2)

    val zeroList = binary.split("1").toMutableList()
    println(zeroList)

    //binary의 끝자리가 1이 아닐경우 마지막 0의 갯수는 gap으로 인정되지 않는다.
    if (binary.last() != '1') {
        zeroList.removeAt(zeroList.size - 1)
    }

    return zeroList.maxOfOrNull { it.length } ?: 0
}
