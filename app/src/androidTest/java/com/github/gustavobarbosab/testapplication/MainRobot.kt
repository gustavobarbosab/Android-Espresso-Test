package com.github.gustavobarbosab.testapplication

import androidx.annotation.IdRes
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers
import org.hamcrest.core.AllOf.allOf

class MainRobot {

    fun assertText(text: String) = apply {
        hasText(R.id.my_title, text)
    }

    fun assertText2(text: String) = apply {
        hasText(R.id.my_title2, text)
    }

    fun assertText3(text: String) = apply {
        hasText(R.id.my_title3, text)
    }

    fun assertText4(text: String) = apply {
        hasText(R.id.my_title4, text)
    }

    fun assertText5(text: String) = apply {
        hasText(R.id.my_title5, text)
    }

    fun assertText6(text: String) = apply {
        hasText(R.id.my_title6, text)
    }

    fun assertText7(text: String) = apply {
        hasText(R.id.my_title7, text)
    }

    fun assertText8(text: String) = apply {
        hasText(R.id.my_title8, text)
    }

    fun assertText9(text: String) = apply {
        hasText(R.id.my_title9, text)
    }

    fun assertText10(text: String) = apply {
        hasText(R.id.my_title10, text)
    }

    private fun hasText(@IdRes viewId: Int, text: String) {
        onView(allOf(ViewMatchers.withId(viewId), ViewMatchers.withText(text)))
            .check(matches(ViewMatchers.isDisplayed()))
    }
}