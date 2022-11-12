fun main() {

    println(solution(intArrayOf()))
}

private fun solution(A: IntArray): Int {
    // O(N) or O(N*log(N))
    if(A.isEmpty()){
        return 1
    }
    A.sort()
    if(A.first() != 1){
        return 1
    }
    var temp = 1
    A.forEach {
        if(temp == it){
            temp +=1
        }else{
            return temp
        }
    }
    if(temp == 1) {
        temp = A.size
    }
    return temp
}
