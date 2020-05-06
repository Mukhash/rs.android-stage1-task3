package subtask3

import java.lang.Integer.*

class ArrayCalculator {

    // TODO: Complete the following function
    fun maxProductOf(numberOfItems: Int, itemsFromArray: Array<Any>): Int {
        val intList = mutableListOf<Int>()
        itemsFromArray.forEach {
            if (it is Int) {
                intList.add(it)
            }
        }
        intList.sortDescending()
        val negatives = intList.filter { it < 0 }.sorted().map { it*-1 }
        var sumOfTwo = 0
        if (negatives.size >= 2) {
            sumOfTwo = negatives[0]*negatives[1]
        }
        var result = 1
        if (intList.isNotEmpty()) {
            if (numberOfItems <= intList.size) {
                if (sumOfTwo > intList[min(numberOfItems, intList.size - 1)] * intList[min(
                        numberOfItems,
                        intList.size - 2
                    )]
                ) {
                    for (i in 0 until 2) {
                        result *= intList[i]
                    }
                    result *= sumOfTwo
                    return result
                } else {
                    for (i in 0 until min(numberOfItems, intList.size)) {
                        result *= intList[i]
                    }
                    return result
                }
            } else {
                for (i in 0 until intList.size) {
                    result *= intList[i]
                }
                return result
            }
        } else {
            return 0
        }
    }
}
