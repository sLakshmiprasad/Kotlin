package conditionals

fun main(args: Array<String>) {
    val age: Int = 2
    if (age < 18) {
        println("you cannot register")
    } else if (age < 21) {
        println("Well, you can register")
    } else {
        println("you can register")
    }

    val mode: Int = 2
    when (mode) {
        1 -> println(" mode is 1")
        2 -> {
            println("mode is 2")
        }
        3 -> println("mode is 3")
        else -> println("mode is not set correctly")
    }

    val result = when (mode) {
        1 -> " mode is 1"
        2 -> {
            println("mode is 2")
            2
        }
        3 -> println("mode is 3")
        else -> println("mode is not set correctly")
    }

    println("Result is $result")

    // Advanced
    val x = 7
    when (x) {
        3 * 3 -> println("x is 9")
        "String".length -> println("x is 6")
        in 1..10 -> println("x is in 1-10")
    //break is implicit in Kotlin 
    }
}