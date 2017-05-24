package Sorting


/**
 * Created by gedeagas on 5/24/17.
 */
object Main {

    @JvmStatic fun main(args: Array<String>) {
        val arrayAngka = intArrayOf(2, 6, 5, 3, 8, 7, 1)

        //Class
        val sortingWithQuickMethod = Quicksort()
        val sortingWithBubbleSort = Bubblesort()
        val sortingWithSelection = Selectionsort()

        println("Array Sebelum di sorting")
        for(i in 0..arrayAngka.size-1)
            print("${arrayAngka[i]} ")


        println()
        //sortingWithBubbleSort.sorting(arrayAngka)
        //sortingWithQuickMethod.sorting(arrayAngka)
        sortingWithSelection.sorting(arrayAngka);
        println()

        println("Array Setelar Di Sorting")
        for (i in 0..arrayAngka.size-1)
            print("${arrayAngka[i]} ")


    }
}
