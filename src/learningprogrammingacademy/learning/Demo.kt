package learningprogrammingacademy.learning

/*
learning programming academy.learning
Standley Eugene
12/8/2017
*/

class ComplexNumber(val real: Float, val imaginary: Float){
    operator fun plus(other: ComplexNumber): ComplexNumber {
        return ComplexNumber(real+ other.real, imaginary + other.imaginary)
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

    println("sum= $sum")
}