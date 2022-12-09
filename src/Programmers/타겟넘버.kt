fun main() {

    println(solution(intArrayOf(1,1,1,1,1), 3))
}

private fun solution(numbers: IntArray, target: Int): Int {
    var answer = 0

    //1. BFS를 활용한 풀이
//    var sums = mutableListOf<Int>()
//
//    //초기값 세팅
//    sums.add(0)
//
//    for (number in numbers) {
//        val partSums = mutableListOf<Int>()
//
//        for (i in sums) {
//            partSums.add(i + number)
//            partSums.add(i - number)
//        }
//        sums = partSums
//    }
//
//
//    return sums.count { it == target }

  //2. DFS를 활용한 풀이
//    var n = numbers.size
//
//    fun dfs(index: Int, result: Int) {
//        if (index == n) {
//            if (result == target) {
//                answer += 1
//            }
//        } else {
//            dfs(index + 1, result + numbers[index])
//            dfs(index + 1, result - numbers[index])
//        }
//    }
//
//    dfs(0, 0)
//    return answer


    val sumFromTen = numbers.fold(listOf(0)) { total, i ->
        println(total)
        total.run {
            map { it + i } + map { it - i }
        }
    }
    println("folded: $sumFromTen") // folded: 39
    return sumFromTen[0]
}
