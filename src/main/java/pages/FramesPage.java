package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class FramesPage {

    private WebDriver driver;
    //elements by NAME
    private String topFrame = "frame-top";
    private String leftFrame = "frame-left";
    private String bottomFrame = "frame-bottom";
    private By body = By.tagName("body");

    public FramesPage(WebDriver driver) {
        this.driver = driver;
    }

    private String getFrameText(){
        return driver.findElement(body).getText();
    }

    public String getLeftFrameText() {
        driver.switchTo().frame(topFrame);
        driver.switchTo().frame(leftFrame);
        String text = getFrameText();
        driver.switchTo().parentFrame(); //exit left to top
        driver.switchTo().parentFrame(); //exit left to main
        return text;
    }

    public String getBottomFrameText() {
        driver.switchTo().frame(bottomFrame);
        String text = getFrameText();
        driver.switchTo().parentFrame(); //exit top to main
        return text;
    }

}
