package Second

fun main() {
    val array = intArrayOf(1, 2, 3)
    val permutations = mutableListOf<List<Int>>()
    generatePermutations(array.toList(), listOf(), permutations)
    permutations.forEach { println(it) }


}



