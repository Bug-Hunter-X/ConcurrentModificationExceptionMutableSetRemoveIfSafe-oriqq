fun main() {
    val set = mutableSetOf(1, 2, 3, 4, 5)
    val toRemove = set.filter { it % 2 == 0 } 
    set.removeAll(toRemove)
    println(set) // Output: [1, 3, 5]

    //Alternative approach using iterator and remove()
    val set2 = mutableSetOf(1, 2, 3, 4, 5)
    val iterator = set2.iterator()
    while (iterator.hasNext()) {
        val element = iterator.next()
        if (element % 2 == 0) {
            iterator.remove()
        }
    }
    println(set2) // Output: [1, 3, 5]
} 