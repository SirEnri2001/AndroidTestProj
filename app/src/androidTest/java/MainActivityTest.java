import androidx.test.core.app.ActivityScenario;
import androidx.test.espresso.action.ViewActions;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import static androidx.test.espresso.Espresso.*;
import com.example.myapplication.MainActivity;
import com.example.myapplication.R;

import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {
    @Test
    public void ensureTextChangesWork(){
        ActivityScenario.launch(MainActivity.class);
        onView(withId(R.id.inputField)).perform(typeText("NewText"),ViewActions.closeSoftKeyboard());

        onView(withId(R.id.switchActivity)).perform(click());

        onView(withId(R.id.resultView)).check(matches(withText("NewText")));
    }
}
