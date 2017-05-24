package RabinMiller

/**
 * Created by gedeagas on 5/24/17.
 */
object Main {
    @JvmStatic fun main(args: Array<String>) {
        val rabinMiller = RabinMillerPrimalityTest()
        val number: Long = 8784
        val accuracy = 5
        if (rabinMiller.checkIfPrime(number, accuracy)) {
            println(number.toString() + " is prime number")
        } else {
            println(number.toString() + " is not a prime number")

        }
    }
}
