import java.util.*

fun main() {

    println(solution(5, intArrayOf(3,4,4,6,1,4,4)))
}

private fun solution(N: Int, A: IntArray): IntArray {
    // write your code in Kotlin 1.6.0 (Linux)
//    (0, 0, 1, 0, 0)
//    (0, 0, 1, 1, 0)
//    (0, 0, 1, 2, 0)
//    (2, 2, 2, 2, 2)
//    (3, 2, 2, 2, 2)
//    (3, 2, 2, 3, 2)
//    (3, 2, 2, 4, 2)
    var list = IntArray(N)

    for(i in A.indices){
        if(A[i] > N){
            //최대값으로 통일 어쨋든 포문이라 2중포문이 되어 자주걸리면 난감해짐.
            Arrays.fill(list, list.maxOrNull()?:0)
        }else{
            list[A[i]-1] += 1
        }
        println(list.contentToString())
    }
    return list
}