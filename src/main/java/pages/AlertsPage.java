package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {
    private WebDriver driver;
    private By triggerAlertButton = By.xpath(".//button[text()='Click for JS Alert']");
    private By results = By.id("result");
    private By triggerConfirmButton = By.xpath(".//button[text()='Click for JS Confirm']");
    private By triggerPrompt = By.xpath(".//button[text()='Click for JS Prompt']");

    public AlertsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void triggerAlertButton() {
        driver.findElement(triggerAlertButton).click();
    }

    public void triggerConfirmButton() {
        driver.findElement(triggerConfirmButton).click();
    }

    public void triggerPrompt(){
        driver.findElement(triggerPrompt).click();
    }

    public void alert_clickToAccept() {
        driver.switchTo().alert().accept();
    }

    public void alert_clickToDismiss() {
        driver.switchTo().alert().dismiss();
    }

    public String alert_getText(){
        return driver.switchTo().alert().getText();
    }

    public void alert_setInput(String text){
        driver.switchTo().alert().sendKeys(text);
    }

    public String getResult(){
        return driver.findElement(results).getText();
    }


}
