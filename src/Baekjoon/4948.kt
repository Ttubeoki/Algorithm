import java.util.*
import kotlin.math.sqrt
//
//
import java.util.*
import kotlin.math.sqrt
//fun main() = with(Scanner(System.`in`)) {
//    while (true){
//        val n = nextInt()
//        if(n == 0) break
//        solution(n)
//    }
//}


fun main() {

    solution(1)      //1
    solution(10)     //4
    solution(13)     //3
    solution(100)    //21
    solution(1000)   //135
    solution(10000)  //1033
    solution(100000)
    solution(0)      //8392
}


private fun solution(n: Int){
    var ans = 0

    for (v in n+1..2*n) {
        var check = true
        var i = 2
        while (i <= sqrt(v.toDouble())) {
            if (v % i == 0) {
                check = false
                break
            }
            i++
        }
        if (check) ans++
    }
    println(ans)
}
