package setone

import java.util.*

class SolutionSet1 {
    fun q1() {
        //Define the Variable which can hold any value

        var dt: Any = 10
        dt = "hello"
        dt = true
        dt = java.util.Date()
    }

    fun q2() {
        // Define Variable which can hold function
        val fn: (Int, Int) -> Unit = fun(a: Int, b: Int) {}
        val lambda: (String, java.util.Date) -> Int = { str, dt -> 10 }
    }

    fun q3() {
        //Declare a function which accepts function as parameter
        fun myFn(fn: () -> Unit) {

        }
    }

    fun q4() {
        // Declare a function which returns another function which returns current date
        val fn: () -> java.util.Date = fun(): java.util.Date {
            return java.util.Date()
        }

        val lambda: () -> java.util.Date = { java.util.Date() }
    }

    fun q5() {
// Represent a function in lambda, anonymous and normal function for accepting float array
// and squaring each element and returning the new array
        val lambda: (arr: FloatArray) -> FloatArray = { arr -> arr.map { it * it }.toFloatArray() }
        println(lambda(floatArrayOf(12.6f, 56.36f, 89.12f)).contentToString())

        val fn = fun(arr: FloatArray): FloatArray {
            return arr.map { it * it }.toFloatArray()
        }
        println(fn(floatArrayOf(12.6f, 56.36f, 89.12f)).contentToString())

        fun namedFn(arr: FloatArray): FloatArray {
            return arr.map { it * it }.toFloatArray()
        }
        println(namedFn(floatArrayOf(12.6f, 56.36f, 89.12f)).contentToString())
    }

    fun q6() {
        //Write a function for repeating given string n times (if language supports infix, it must be infix)
        infix fun String.repeatN(n: Int) = this.repeat(n)
        println("hi".repeatN(10))
        println("hi" repeatN 10)
    }

    fun q7() {
        // Write a function for converting string to an char array (if language supports infix, it must be infix)

        // here not using infix, because it is no satisfying conditions of infix
        fun String.makeCharArray() = this.toCharArray()
        "hello".makeCharArray().forEach(::println)
    }

    fun q8() {
        // Write a function for upper casing nth element in given char array

        infix fun CharArray.upperNth(n: Int) = this.set(n, (this.get(n).code - 32).toChar())

        val arr = charArrayOf('c', 'p', 'q', 'f', 'b')
        arr upperNth 2
        arr.forEach(::print)
    }

    fun q9() {
        // Write code for explaining traling lambdas can be taken out of parenthesis

        fun myDt(num: Int, fn: (Int) -> Unit) {
            fn(num)
        }

        myDt(10, fun(num: Int) {
            println(num)
        })

        myDt(10, { println(it) })
        myDt(10) { println(it) }
    }

    fun q10() {
        // Create an array with default string value of each element i.e. hello.
        // Write a function for changing nth element of same array to hi

        val arr = Array<String>(10) { "hello" }
        infix fun Array<String>.changeNthToHi(n: Int) = this.set(n, "Hi")

        arr changeNthToHi 2
        println(arr.contentToString())
    }

    fun q11() {

        // change type of float to int

        val flt = 10.56f
        val int = flt.toInt()
        println(int)
    }

    fun q12() {
        // convert string to int
        val str = "10"
        var i = str.toInt()
        println("${++i}")
    }

    fun q13() {
        //write a funtion to check type of given argument ( must be inline if supports)

        val checkType: (prm: Any) -> String = {
            when (it) {
                is Int -> "Integer"
                is Float -> "Float"
                else -> "Bad Type"
            }
        }

        println(checkType(10))
        println(checkType("Hello"))
    }

    fun q14() {

//    Write a function to calculate the sum, avg, min, max of given array

        val arr = intArrayOf(1, 23, 3)
        println("Sum ${arr.sum()}")
        println("Average ${arr.average()}")
        println("Minimum ${arr.minOrNull()}")
        println("Maximum ${arr.maxOrNull()}")
    }

    fun q15() {
        // Write a function to calculate second-highest element in an array
        val arr = intArrayOf(1, 23, 3, 89, 63, 74, 15)
        Arrays.sort(arr)
        println("Second Highest Number ${arr.get(arr.size - 2)}")
    }

    fun q16() {
        // Write a function to calculate nth highest element in an array
        fun nthMax(n: Int, dtArr: IntArray) {
            Arrays.sort(dtArr)
            println("${n}th Highest Number ${dtArr.get(dtArr.size - n)}")
        }

        val arr = intArrayOf(1, 23, 3, 89, 63, 74, 15)
        nthMax(3, arr)
    }

    fun q17() {
        //Get marks from user and display result conditions, marks > 70 = distinction, marks > 60 = pass, marks <= 60 second class, marks >= 40 third class, marks < 40 = fail
        println("Enter Marks: ")
        val status = when (readLine()?.toInt() ?: 0) {
            in 70..100 -> "distinction"
            in 60..70 -> "pass"
            in 40..60 -> "second class"
            in 0..39 -> "fail"
            else -> "invalid marks"
        }
        println(status)
    }

    fun q18() {
        //Get investment amount from user and suggest stock names to invest in. Amount > 1L = abc, amount between 1.5 to 2L = pqr, amount between 2.5L and above = xyz
        println("Enter Amount to Invest: ")
        val amount = readLine()?.toInt() ?: 0
        val stock = when {
            amount in 1_00_00..1_49_999 -> "abc"
            amount in 1_50_000..2_00_000 -> "pqr"
            amount > 2_50_000 -> "xyz"
            else -> "Invalid Amount"
        }
        println(stock)
    }

    fun q19() {
        // Write a function to print string array in reversed order (use loop, no reverse/ready function)

        val array = arrayOf("abc", "pqr", "xyz", "lmn", "tuv")

        for (i in (array.size - 1) downTo 0) {
            println(array[i])
        }
    }

    fun q20() {
        var i = 10
        var j = 20

        println("i + j ${i + j}")
        println("i - j ${i - j}")
        println("i * j ${i * j}")
        println("i / j ${i / j}")
        println("i == j ${i == j}")
        println("i != j ${i != j}")
        println("i++ ${i++} ${++j}")
        println(" --i ${--i}")
        println("i & j ${i.and(j)}")
        println("i & j ${i and j}")
        println("i | j ${i or j}")
        println("i ^ j ${i xor j}")
        println("i && j ${(i > j) && (i > 50)}")
        println("i || j ${(i < j) || (i > 10)}")
        println("i <= j ${(i <= j)}")
        println("i >= j ${(i >= j)}")
        println("Not ${!(i == j)}")
        println("Not ${(i == j).not()}")
    }
}