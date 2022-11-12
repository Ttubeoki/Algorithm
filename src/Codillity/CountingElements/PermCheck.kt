fun main() {

    println(solution(intArrayOf(1,1)))
}

private fun solution(A: IntArray): Int {

    val list = mutableSetOf<Int>()
    A.forEach {
        //1차 걸러내기 사이즈보다 크면 연결 될 수 없음
        if(it > A.size) return 0

        //2차 걸러내기 중복값이 있으면 연결 될 수 없음
        if(list.contains(it)) return 0

        list += it
    }
    //끝나면 리턴
    return 1
}
