package slider;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class HorizontalSliderTests extends BaseTests {

    @Test
    public void slideRightTest(){
        var horizontalSlider = homePage.clickHorizontalSlider();
        String value = "4";
        horizontalSlider.setSliderValue(value);
        assertEquals(horizontalSlider.getSliderValue(), value,"Slider value is incorrect");
    }
}
