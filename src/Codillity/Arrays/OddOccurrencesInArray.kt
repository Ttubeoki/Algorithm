fun main() {

    println(solution(intArrayOf(3,5,3,4,5,101,7,101,7)))
}

private fun solution(A: IntArray): Int {

//    !! time complexity O(N**2) !!
//    return A.mapIndexed { index, i -> i to index }
//        .groupBy { it.first }
//        .filterValues { it.size < 2 }
//        .keys.first()

//    !! time complexity O(N**2) !!
//    val nums = A.toList()
//    return nums.filter { item -> nums.count{ it == item} == 1}[0]

    /** time complex O(N) or O(N*log(N)) */
    var result = 0

    A.forEach {
        //xor 숫자가 같으면 0 다르면 1
        result = result xor it
        println(result)
    }
    return result

}
