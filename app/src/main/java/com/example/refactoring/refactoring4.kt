package com.example.refactoring

class refactoring4 {
    fun main() {
        val numbers = arrayOf(1, 2, 3, 4, 5)
        var sum = 0
        for (number in numbers) {
            sum += number
        }
        val average = sum.toDouble() / numbers.size
        println("Среднее арифметическое: $average")
    }

}