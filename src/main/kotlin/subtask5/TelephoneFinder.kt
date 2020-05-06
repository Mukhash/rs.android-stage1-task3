package subtask5

class TelephoneFinder {

    // TODO: Complete the following function
    fun findAllNumbersFromGivenNumber(number: String): Array<String>? {
        if (number.toInt() < 0) {
            return null
        } else {
            val list = mutableListOf<String>()
            val hashMap = hashMapOf<String, String>(
                "1" to "24", "2" to "153", "3" to "26", "4" to "157", "5" to "2468",
                "6" to "359", "7" to "48", "8" to "7590", "9" to "68", "0" to "8"
            )

            val delim = number.split("").drop(1).dropLast(1).toMutableList()
            for (i in delim.indices) {
                val temp = number.split("").drop(1).dropLast(1).toMutableList()
                val neighbours = hashMap[delim[i]]?.split("")?.drop(1)?.dropLast(1)
                if (neighbours != null) {
                    for (n in neighbours) {
                        temp[i] = n
                        list.add(temp.joinToString(""))
                    }
                }
            }
            return list.toTypedArray()
        }
    }
}
