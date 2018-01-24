package learningprogrammingacademy.learning

/*
learning programming academy.learning
Standley Eugene
12/8/2017
*/
/*
    Using knowledge from previous lesson overload - (mius) and * (times) operator in Complex Number class
    Print to console results of - and * operation
 */
class ComplexNumber(val real: Float, val imaginary: Float){
    operator fun plus(other: ComplexNumber): ComplexNumber {
        return ComplexNumber(real+ other.real, imaginary + other.imaginary)
    }

    operator fun minus(other: ComplexNumber): ComplexNumber{
        return ComplexNumber(real - other.real, imaginary - other.imaginary)
    }

    operator fun times(other: ComplexNumber): ComplexNumber{
        //return ComplexNumber(real * other.real, imaginary * other.imaginary)
        val realResult = real  * other.real - imaginary * other.imaginary
        val imaginaryResult = imaginary * other.real + real * other.imaginary

        return ComplexNumber(realResult, imaginaryResult)
    }

    override fun toString(): String {
        var sign = "+"

        if(imaginary < 0){
            sign = "-"
        }

        return "$real $sign ${Math.abs(imaginary)}"
    }
}

fun main(args: Array<String>) {
    val first = ComplexNumber(2f,2f)
    val second = ComplexNumber(3f, -5f)

    println("first= $first")
    println("second= $second")

    val sum = first + second
    val minus = first - second
    val multiply = first * second

    println("sum= $sum")
    println("minus= $minus")
    println("multiply= $multiply")
}