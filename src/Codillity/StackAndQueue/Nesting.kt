import java.util.*

fun main() {

    println(solution("())(()"))
}

private fun solution(S: String): Int {
    // write your code in Kotlin 1.6.0 (Linux)
    val stackString = Stack<Char>()
    if(S.startsWith(")")){
        return 0
    }

    S.forEach {
        if(stackString.isEmpty()){
            if(it == ')'){
                return 0
            }
            stackString.push(it)
        }else{
            if(!stackString.peek().equals(it)){
                stackString.pop()
            }else{
                stackString.push(it)
            }
        }
    }
    return if(stackString.isEmpty()){1}else{0}
}
