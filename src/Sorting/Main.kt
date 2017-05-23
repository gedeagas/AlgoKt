package Sorting

import java.util.Arrays

/**
 * Created by gedeagas on 5/24/17.
 */
object Main {

    @JvmStatic fun main(args: Array<String>) {
        val sortingWithQuickMethod = Quicksort()
        println(0 + (6 - 0) / 2)

        val arrayAngka = intArrayOf(2, 6, 5, 3, 8, 7, 1)
        sortingWithQuickMethod.sorting(arrayAngka)

        println("Sorted array :" + Arrays.toString(arrayAngka))

    }
}
