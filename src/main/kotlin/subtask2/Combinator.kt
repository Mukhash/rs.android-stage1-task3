package subtask2

class Combinator {

    // TODO: Complete the following function
    fun checkChooseFromArray(array: Array<Int>): Int? {
        val m: Long = array[0].toLong()
        val n = array[1]
        var temp: Long = 0
        for (i in 1..n) {
            val a = getF(n).toLong()
            val b = getF(i).toLong()
            val n_i = getF(n - i).toLong()
            temp = a / (b * n_i)
            if (temp == m) {
                return i
            }
        }
        return null
    }

    private fun getF(num: Int): Long {
        var result = 1L
        var inc = num
        while (inc >= 1) {
            result *= inc
            inc -= 1
        }
        return result
    }
}
