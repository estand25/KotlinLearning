package learningprogrammingacademy.learning

/*
learning programming academy.learning
Standley Eugene
12/8/2017
*/

/**
 * extenstion
 * write extension method that will return true if string has even number of characters
 * or false if string has odd number of characters
 * test method in main with few different string
 *
 * StringUtils
 * write method in StringUtils that will calculate sum of two string lengths, or in others words sum of characters
 * in 2 string
 * tip: use modulus operator for even odd testing
 * tip: be carful with null values and empty string
 */
object StringUtils {
    fun totalStringLength(a: String?, b: String?): Int{
        if(a.isNullOrEmpty() && b.isNullOrEmpty())
            return 0
        else if(a.isNullOrEmpty())
            return b!!.length
        else if(b.isNullOrBlank())
            return a!!.length

        return a!!.length + b!!.length
    }
}

fun String?.isLengthEven() = !(this.isNullOrBlank()) && (this!!.length % 2 == 0)

fun main(args: Array<String>){

    var test: String? = "1234"
    println("Test = ${test.isLengthEven()}")

    test = "12345"
    println("Test = ${test.isLengthEven()}")

    test = null
    println("Test = ${test.isLengthEven()}")

    test = ""
    println("Test = ${test.isLengthEven()}")

    var a: String? = "123"
    var b: String? = "123"
    println("sum length a & b = ${StringUtils.totalStringLength(a,b)}")

    a = ""
    b = "123"
    println("sum length a & b = ${StringUtils.totalStringLength(a,b)}")

    a = "123"
    b = null
    println("sum length a & b = ${StringUtils.totalStringLength(a,b)}")

    a = null
    b = null
    println("sum length a & b = ${StringUtils.totalStringLength(a,b)}")

    a = ""
    b = ""
    println("sum length a & b = ${StringUtils.totalStringLength(a,b)}")
}

