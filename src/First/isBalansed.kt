package First

fun checkBalanceWithCounts(input: Any): Triple<Boolean, Int, Int> {
    if (input !is String) myError("Ввод должен быть строкой")

    val stack = mutableListOf<Char>()
    val pairs = mapOf(')' to '(', ']' to '[', '}' to '{')
    var openCount = 0
    var closeCount = 0

    for (char in input) {
        when (char) {
            '(', '[', '{' -> {
                stack.add(char)
                openCount++
            }
            ')', ']', '}' -> {
                closeCount++
                if (stack.isEmpty() || stack.removeAt(stack.size - 1) != pairs[char]) {
                    return Triple(false, openCount, closeCount)
                }
            }
        }
    }
    return Triple(stack.isEmpty(), openCount, closeCount)
}
fun printResult(input: String): Unit {
    val result = checkBalanceWithCounts(input)
    println("Ввод: $input")
    println("Сбалансировано: ${result.first}, Открытых: ${result.second}, Закрытых: ${result.third}\n")
}
fun myError(message: String): Nothing {
    throw IllegalArgumentException(message)
}