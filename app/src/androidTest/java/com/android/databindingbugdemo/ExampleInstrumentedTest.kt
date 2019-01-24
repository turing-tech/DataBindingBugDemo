package com.android.databindingbugdemo

import androidx.test.espresso.Espresso.onData
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import org.hamcrest.core.Is.`is`
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class UITests {

    @get:Rule
    var activityRule: ActivityTestRule<MainActivity> = ActivityTestRule(MainActivity::class.java)

    @Test
    fun openWelcomeScreen() {
        repeat(10) {
            for (flavor in Flavor.values()) {
                onView(withId(R.id.flavorSpinner))
                        .perform(click())

                onData(`is`(flavor.title))
                        .perform(click())

                onView(withText("Open Details"))
                        .perform(click())

                onView(ViewMatchers.withContentDescription(R.string.abc_action_bar_up_description))
                        .perform(click())
            }
        }
    }

}
