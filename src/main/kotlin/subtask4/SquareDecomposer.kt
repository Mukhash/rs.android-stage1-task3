package subtask4

import kotlin.math.floor
import kotlin.math.sqrt

class SquareDecomposer {

    fun clear(rawList: MutableList<Int>): MutableList<Int> {
        val hashMap = hashMapOf<Int, Int>()
        for (num in rawList) {
            hashMap.put(key = num, value = 0)
        }
        val clearList = mutableListOf<Int>()
        clearList.addAll(hashMap.keys)
        clearList.sort()
        return clearList
    }


    fun decomposeNumber(number: Int): Array<Int>? {
        val squaredNum = number * number
        return dec(squaredNum, number - 1)
    }

    private fun dec(value: Int, oneLess: Int): Array<Int>? {
        for (i in oneLess downTo 1) {
            val squared = i * i
            val left = value - squared
            if (0 == left) {
                return arrayOf(i)
            }
            if (0 > left) {
                return null
            }
            var root = floor(sqrt(left.toDouble())).toInt()
            if (root >= i) {
                root = i - 1
            }
            val deced = dec(left, root)
            if (null != deced) {
                return deced + arrayOf(i)
            }
        }
        return null
    }
}
