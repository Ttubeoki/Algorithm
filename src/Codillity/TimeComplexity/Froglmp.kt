fun main() {

    println(solution(1, 5, 2))
}

private fun solution(X: Int, Y:Int, D: Int): Int {
    /** O(1) */
    if(X==Y){
        return 0
    }
    return if((Y-X)%D == 0){
        (Y-X)/D
    }else{
        (Y-X)/D+1
    }
}
