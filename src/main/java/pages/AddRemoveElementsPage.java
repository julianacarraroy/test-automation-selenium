package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class AddRemoveElementsPage {

    private WebDriver driver;
    private By addElementButton = By.cssSelector("button[onclick=\"addElement()\"]");
    private By deleteElementButton = By.cssSelector("button[onclick=\"deleteElement()\"]");

    public AddRemoveElementsPage(WebDriver driver){
        this.driver=driver;
    }

    public void clickAddElementButton(){
        driver.findElement(addElementButton).click();
    }

    public WebElement getButton(){
        return driver.findElement(deleteElementButton);
    }

    public boolean verifyNoElement() {
        try {
            return !getButton().isDisplayed();
        } catch (Exception e) {
            return true;
        }
    }

    public void clickDeleteElementButton(){
        driver.findElement(deleteElementButton).click();
    }


}
