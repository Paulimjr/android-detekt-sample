package com.android.detekt.sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import java.lang.IllegalArgumentException

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        runBlocking {
            coroutineTestRules()
        }
    }

    private suspend fun coroutineTestRules() {
        GlobalScope.launch {

            sampleIfEmpty() //If empty body

            samplePossibleBugCrash() // Possible crash or bug

            tooMuchParameter("", "", "", "", "", "", "") // Too much parameter

        }
    }

    private fun sampleIfEmpty() {
        val example = "Example IF Empty"
        if (example == example) {

        }
    }

    private fun samplePossibleBugCrash() {
        val valueBug = Bug(name = null)
        try {
            if (valueBug == null) {
                throw RuntimeException("Runtime exception example")
            }
        } catch (ex: IllegalArgumentException) {
            println("ex : IllegalArgumentException")
        }
    }

    private fun tooMuchParameter(name: String, email: String, phone: String, address: String, zipCode: String, city: String, country: String): String {
        return name
    }

    class Bug(val name: String? = null)

}
