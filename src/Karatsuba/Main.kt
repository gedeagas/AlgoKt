package Karatsuba

/**
 * Created by gedeagas on 5/24/17.
 */
object Main {
    @JvmStatic fun main(args: Array<String>) {
        val krs = KaratsubaMultiplication()

        println(krs.doKaratsuba(100, 100))
    }
}
