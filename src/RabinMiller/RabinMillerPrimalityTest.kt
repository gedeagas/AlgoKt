package RabinMiller

import java.math.BigInteger
import java.util.Random

/**
 * Created by gedeagas on 5/24/17.
 */
class RabinMillerPrimalityTest {
    fun checkIfPrime(n: Long, it: Int): Boolean {
        if (n == 0L || n == 1L)
            return false
        if (n == 2L)
            return true
        if (n % 2L == 0L)
            return false
        var s = n - 1
        while (s % 2L == 0L)
            s /= 2

        val rand = Random()
        for (i in 0..it - 1) {
            val r = Math.abs(rand.nextLong())
            val a = r % (n - 1) + 1
            var temp = s
            var mod = checkPow(a, temp, n)
            while (temp != n - 1 && mod != 1L && mod != n - 1) {
                mod = checkMod(mod, mod, n)
                temp *= 2
            }
            if (mod != n - 1 && temp % 2L == 0L)
                return false
        }
        return true
    }

    //(a ^ b) % c
    private fun checkPow(a: Long, b: Long, c: Long): Long {
        var res: Long = 1
        for (i in 0..b - 1) {
            res *= a
            res %= c
        }
        return res % c
    }

    //(a * b) % c
    private fun checkMod(a: Long, b: Long, mod: Long): Long {
        return BigInteger.valueOf(a).multiply(BigInteger.valueOf(b)).mod(BigInteger.valueOf(mod)).toLong()
    }
}
