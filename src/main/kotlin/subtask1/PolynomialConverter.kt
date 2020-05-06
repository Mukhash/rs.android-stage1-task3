package subtask1

class PolynomialConverter {

    // TODO: Complete the following function
    fun convertToStringFrom(numbers: Array<Int>): String? {
        val size = numbers.size - 1
        var poly = numbers.size - 1
        var result = ""
        val str = "x^"
        return if (numbers.isNotEmpty()) {
            result += "${numbers[0]}$str$poly"
            poly -= 1
            while (poly >= 0) {
                if (numbers[size-poly] != 0) {
                    result += " + ${numbers[size-poly]}$str$poly"
                    poly -= 1
                } else {
                    result += ""
                    poly -= 1
                }
            }
            result = result
                .replace("+ -", "- ")
                .replace(" 1", " ")
                .replace("^1", "")
                .replace("x^0", "")
            result
        } else { null }
    }
}
//arrayOf(2, -1, 78)
//arrayOf(2, 8, 0, 78)
// "2x^3 + 8x^2 + 78"