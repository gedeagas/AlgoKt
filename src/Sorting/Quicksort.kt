package Sorting

class Quicksort {

    private var array: IntArray? = null
    private var length: Int = 0

    fun sorting(userinput: IntArray) {
        this.array = userinput
        this.length = this.array!!.size
        quickSorting(0, length - 1)
    }

    private fun quickSorting(lo: Int, hi: Int) {
        var x = lo
        var y = hi
        val pivot = array!![lo + (hi - lo) / 2]
        while (x <= y) {

            while (array!![x] < pivot) {
                x++
            }

            while (array!![y] > pivot) {
                y--
            }

            if (x <= y) {
                swap(x, y)
                x++
                y--
            }
        }

        if (lo < y) {
            quickSorting(lo, y)
        }

        if (x < hi) {
            quickSorting(x, hi)
        }

    }



    private fun swap(i: Int, j: Int) {
        val temp = array!![i]
        array!![i] = array!![j]
        array!![j] = temp
    }


}
