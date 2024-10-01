package First

fun main() {
    val testString1 = "{([])}"
    val testString2 = "{([))}"
    val testString3 = "{{[])}"

    printResult(testString1)
    printResult(testString2)
    printResult(testString3)
}
