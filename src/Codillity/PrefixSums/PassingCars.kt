fun main() {

    println(solution(intArrayOf(0,1,0,1,1)))
}

private fun solution(A: IntArray): Int {

    var count = 0
    val maxSize = A.size
    val exceptCount = 1000000000
    val zero =arrayListOf<Int>()

    //[0,2]
    for (i in A.indices) {
        if (A[i] == 0) {
            zero.add(i)
        }
    }
    //2
    val zSize = zero.size
    for (i in zero.indices) {
        if(count > exceptCount) return -1
        //5 - 2 = 3
        //3 - 0 + 0 = 3
        //3 - 2 + 1 = 2
        count += maxSize - zSize - zero[i] + i
    }
    return count
}
