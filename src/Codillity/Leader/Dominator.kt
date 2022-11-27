
import java.util.*


/**
A[0] = 3    A[1] = 4    A[2] =  3
A[3] = 2    A[4] = 3    A[5] = -1
A[6] = 3    A[7] = 3
 */

fun main() {
    println(solution(intArrayOf(3,4,3,2,3,-1,3,3)))
}

private fun solution(A: IntArray): Int {
    val B = A.clone()
    Arrays.sort(A)
    val length: Int = A.size
    if (length == 0) {
        return -1
    }
    var count = 0
    //반이 넘는것이기 때문에 중앙은 항상 최고 값이다.
    val cadidate = A[length / 2]
    for (a in A) {
        if (a == cadidate) {
            count++
        }
    }
    //반이상이 안넘으면 대표leader가 없다
    if (count < length / 2 + 1) {
        return -1
    }
    //clone 한곳에서 찾는다.
    for (i in B.indices) {
        if (B[i] == cadidate) {
            return i
        }
    }
    return 0
}
