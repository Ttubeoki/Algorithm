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

    solution(intArrayOf(120,110,140,150), 485)
}


//binary search
private fun solution(budgets: IntArray, M:Int){

    // 110, 120, 140, 150
    budgets.sort()

    var right = budgets[budgets.lastIndex]
    var left = 1
    var pivot = 0

    while (right >= left) {
        pivot = (right + left) / 2
        println("right $right, left $left, pivot $pivot")

        var totalBudget = M

        for (budget in budgets){
            println("$totalBudget - budget $budget / pivot $pivot" )
            totalBudget -= if (budget > pivot) pivot else budget
        }


        if (totalBudget >= 0) {
            left = pivot + 1
        } else{
            right = pivot - 1
        }
    }

    println(right)
}
