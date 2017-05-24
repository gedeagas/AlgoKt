package Karatsuba

/**
 * Created by gedeagas on 5/24/17.
 */
class KaratsubaMultiplication {

    fun doKaratsuba(num1: Long, num2: Long): Long {
        if (num1 < 10 || num2 < 10) {
            return num1 * num2
        }
        val m = Math.round(java.lang.Long.toString(num1).length.toFloat()).toDouble()
        val m2 = m / 2
        val a = (num1 / Math.pow(10.0, Math.round(m2).toDouble())).toLong()
        val b = (num1 % Math.pow(10.0, Math.round(m2).toDouble())).toLong()
        val c = (num2 / Math.pow(10.0, Math.round(m2).toDouble())).toLong()
        val d = (num2 % Math.pow(10.0, Math.round(m2).toDouble())).toLong()
        val z0 = doKaratsuba(a, c)
        val z1 = doKaratsuba(b, d)
        val z2 = doKaratsuba(a + b, c + d)

        return (z0 * Math.pow(10.0, Math.round(m).toDouble()) + (z2 - z1 - z0) * Math.pow(10.0, Math.round(m2).toDouble()) + z1.toDouble()).toLong()
    }
}
