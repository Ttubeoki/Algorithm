fun main() {

    println(solution(intArrayOf(-100,-3,5,7)))
}

private fun solution(A: IntArray): Int {
    val size = A.size
    A.sort()

    //음수일경우
    val a1  = A[0]*A[1]*A[size-1]
    //양수
    val a2 = A[size-1]*A[size-2]*A[size-3]

    return if(a1 > a2) {
        a1
    }else{
        a2
    }
}
