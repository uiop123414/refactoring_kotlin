package com.example.refactoring

class refactoring2 {

    fun factorial(n: Int): Int {
        if (n == 0){
            return 1
        }
        else {
            return n * factorial(n - 1)
        }
    }

    fun main() {
        val number = 5
        val result = factorial(number)
        println("Факториал числа $number: $result")
    }

}