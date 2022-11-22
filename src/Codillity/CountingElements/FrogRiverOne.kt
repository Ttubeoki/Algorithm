fun main() {

    println(solution(5,intArrayOf(1,3,1,4,2,3,5,4)))
    println(solution(5,intArrayOf(1,3,1,4,2,3,5,4)))
    println(solution(5,intArrayOf(1,3,1,4,2,3,5,4)))
}

private fun solution(X: Int, A: IntArray): Int {

    //HashMap이 좀 더 빠른 듯 같은 O(N)/
    val leaf = mutableSetOf<Int>()
    A.forEachIndexed { index, i ->
        leaf += i
        if(leaf.size == X){
            return index
        }
    }
    return -1
}
