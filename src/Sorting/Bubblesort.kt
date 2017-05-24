package Sorting

/**
 * Created by gedeagas on 5/24/17.
 */
class Bubblesort {
    private var array: IntArray? = null
    private var length: Int = 0

    fun sorting(userinput: IntArray) {
        this.array = userinput
        this.length = this.array!!.size
        bubbleSorting(length-1)
    }

    private fun bubbleSorting(length: Int){
        var holderNilai: Int = 1
        while (holderNilai != 0){
            holderNilai = 0
            for (i in 0..length){
                if(i < (length-1) && array!![i] > array!![i+1]){
                    val tmp = array!![i]
                    array!![i] = array!![i+1]
                    array!![i+1] = tmp
                    holderNilai++
                }
            }


        }

    }
}