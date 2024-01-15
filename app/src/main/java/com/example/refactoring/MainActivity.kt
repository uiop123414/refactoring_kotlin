package com.example.refactoring

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

    //part 1
        val numbers = listOf(1, 2, 3, 4, 5)
        var sum = 0
        for (number in numbers) {
            sum += number
        }
        println(sum)
    //part 2
        val name: String? = getName()
        if (name != null) {
            println("Привет, $name!")
        }
    //part 3
        class Person(val name: String, val age: Int)
        val person1 = Person("John", 25)
        val person2 = Person("John", 25)

    //part 4
        val name: String? = getName()
        val formattedName = if (name != null) name else "Unknown"
        println(formattedName)





        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

