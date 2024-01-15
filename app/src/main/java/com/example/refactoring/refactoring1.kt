package com.example.refactoring

class refactoring1 {
    fun main() {
        val numbers = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        val evenNumbers = mutableListOf<Int>()
        val oddNumbers = mutableListOf<Int>()

        for (number in numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number)
            } else {
                oddNumbers.add(number)
            }
        }

        println("Even numbers: $evenNumbers")
        println("Odd numbers: $oddNumbers")

        val sum = calculateSum(numbers)
        println("Sum of all numbers: $sum")

        val average = calculateAverage(numbers)
        println("Average of all numbers: $average")
    }

    fun calculateSum(numbers: List<Int>): Int {
        var sum = 0
        for (number in numbers) {
            sum += number
        }
        return sum
    }

    fun calculateAverage(numbers: List<Int>): Double {
        var sum = 0
        for (number in numbers) {
            sum += number
        }
        return sum.toDouble() / numbers.size
    }

}