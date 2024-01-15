package com.example.refactoring

class refactoring3 {
    fun isPrime(n: Int): Boolean {
        if (n <= 1) {
            return false
        }
        val range = IntRange(2,n)
        for (i  in range) {
            if (n % i == 0) {
                return false
            }
        }
        return true
    }

    fun main() {
        val start = 1
        val end = 100
        println("Простые числа в диапазоне от $start до $end:")
        for (i in start..end) {
            if (isPrime(i)) {
                print("$i ")
            }
        }
    }

}