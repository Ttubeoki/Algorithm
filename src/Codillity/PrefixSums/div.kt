fun main() {

    println(solution(6,11,2))
}

private fun solution(A: Int, B: Int, K: Int): Int {
    // write your code in Kotlin 1.6.0 (Linux)

    // 최대값 나눈거에서 최소값 나눈거 빼기
    // 만약 A와 B가 같으면 무조건 1임.
    // 시작점 뺴야함
    return if(A%K == 0){
        B/K- A/K +1
    }else{
        B/K - A/K
    }
}
