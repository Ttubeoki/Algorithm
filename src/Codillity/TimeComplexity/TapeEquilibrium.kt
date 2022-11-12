import java.lang.Math.abs

fun main() {

    println(solution(intArrayOf(3,1,2,4,3)))
}

private fun solution(A: IntArray): Int {
    // 예상 1
    val sum = A.sum()
    val tempArray = mutableListOf<Int>()

    var tempSum = 0
    A.forEach { i ->
        tempSum += i
        tempArray.add(kotlin.math.abs(tempSum - (sum - tempSum)))
    }
    tempArray.removeLast()

    // tempSum 에 index 마다 합이 존재.

    return tempArray.minOrNull()?:0
}
