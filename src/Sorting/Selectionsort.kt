package Sorting

/**
 * Created by gedeagas on 5/24/17.
 */

class Selectionsort(){
    private var array: IntArray? = null
    private var length: Int = 0

    fun sorting(userinput: IntArray) {
        this.array = userinput
        this.length = this.array!!.size
        selectionSort(length - 1)
    }

    fun selectionSort(length: Int){
        var start: Int = 0

        while (start<length){
            var lowest: Int = array!![start]

            for (i in start..length){
                if(array!![i] < lowest){
                    lowest = array!![i]

                    val temp = array!![start]
                    array!![start] = lowest
                    array!![i] = temp
                    println("Lowest ${lowest}")

                }

            }

            println(start)

            start++
        }

    }
}