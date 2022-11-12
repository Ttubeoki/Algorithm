
import java.util.*


fun main() {

    println(solution("{[()()]}"))
}

private fun solution(S: String): Int {
    val stack = Stack<Char>()
    var lastChar: Char
    for (c in S.toCharArray()) {
        if (c == '(' || c == '[' || c == '{') stack.push(c) else {
            if (stack.empty()) return 0
            lastChar = stack.pop()
            if (c == ')' && lastChar != '(') return 0
            else if (c == ']' && lastChar != '[') return 0
            else if (c == '}' && lastChar != '{') return 0
        }
    }
    return if (stack.isEmpty()) 1 else 0
}
