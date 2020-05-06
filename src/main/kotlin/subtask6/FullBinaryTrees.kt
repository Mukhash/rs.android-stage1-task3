package subtask6

class FullBinaryTrees {

    // TODO: Complete the following function
    fun stringForNodeCount(count: Int): String {
        var result = ""
        if (count == 0 || count % 2 == 0) {
            return "[]"
        } else if (count == 1) {
            return "[[0]]"
        } else {
            val tree: List<Int?> = listOf(0, 0, 0)
            var treeTemp = tree.toMutableList()
            zz(treeTemp)
            if (treeTemp.count{it==0} == count) {
                result += treeTemp.toString()
                treeTemp = tree.toMutableList()
            }


            return result
        }
    }
    private fun zz(list: MutableList<Int?>): MutableList<Int?> {
        repeat(2) { list.add(0) }
        return list
    }
}
