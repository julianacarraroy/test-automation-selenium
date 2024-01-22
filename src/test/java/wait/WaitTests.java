package wait;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class WaitTests extends BaseTests {


    @Test
    public void testWaitUntilHidden(){
        var loadingPage = homePage.clickDynamicLoad().clickExample1();
        loadingPage.clickStart();
        assertEquals(loadingPage.getLoadedText(), "Hello World!", "Loaded text incorrect");
    }

    @Test
    public void testWaitUntilVisible(){
        var loadingPage = homePage.clickDynamicLoad().clickExample2();
        loadingPage.clickStartButton();
        //assertEquals(loadingPage.getLoadedText(), "Hello World!", "Loaded text incorrect");
        assertFalse(loadingPage.isStartButtonDisplayed());
    }
}
