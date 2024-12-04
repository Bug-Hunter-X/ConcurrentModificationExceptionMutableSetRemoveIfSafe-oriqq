# ConcurrentModificationException in Kotlin MutableSet.removeIf

This repository demonstrates a subtle difference in behavior between `MutableList.removeIf` and `MutableSet.removeIf` in Kotlin. While `MutableList.removeIf` works as expected, `MutableSet.removeIf` throws a `ConcurrentModificationException`.

The issue arises because the iterator used internally by `removeIf` in `MutableSet` is not fail-fast.  This means modifications made during iteration (even by `removeIf` itself) can lead to unexpected behavior and exceptions. 

The provided example code shows the issue and a suggested solution (see `bugSolution.kt`).