
fun main() {
    println(solution(intArrayOf(3, 8, 9, 7, 6), 2).contentToString())

}
private fun solution(A: IntArray, K: Int): IntArray {
    return if(A.isEmpty()){
        A
    }else{
        val moveTime = K % A.size
        if(moveTime == 0){
            return A
        }else{
            A.copyOfRange(A.size-moveTime, A.size) + A.copyOfRange(0, A.size-moveTime)
        }
    }
}
