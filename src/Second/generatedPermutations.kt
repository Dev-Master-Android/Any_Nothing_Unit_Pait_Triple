package Second

fun generatePermutations(remaining: List<Int>, current: List<Int>, result: MutableList<List<Int>>): Unit {
    if (remaining.isEmpty()) {
        result.add(current)
    } else {
        for (i in remaining.indices) {
            val newRemaining = remaining.toMutableList()
            val newCurrent = current.toMutableList()
            newCurrent.add(newRemaining.removeAt(i))
            generatePermutations(newRemaining, newCurrent, result)
        }
    }
}