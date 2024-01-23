package com.github.gustavobarbosab.testapplication

import androidx.test.core.app.ActivityScenario
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Rule

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @get:Rule
//    val mockWebServer = Mock()

    private val robot = MainRobot()

    fun startTest(func: ActivityScenario<MainActivity>.() -> Unit) {
        val scenario = ActivityScenario.launch(MainActivity::class.java)
        func(scenario)
        scenario.close()
    }

    @Test
    fun testingIfTextIsHelloWorld() {
        startTest {
            robot
                .assertText("Hello World!")
                .assertText2("Hello World 2!")
                .assertText3("Hello World 3!")
                .assertText4("Hello World 4!")
                .assertText5("Hello World 5!")
                .assertText6("Hello World 6!")
                .assertText7("Hello World 7!")
                .assertText8("Hello World 8!")
                .assertText9("Hello World 9!")
                .assertText10("Hello World 10!")
        }
    }
}