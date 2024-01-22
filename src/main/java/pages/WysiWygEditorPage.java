package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class WysiWygEditorPage {

    private WebDriver driver;
    private String editorIdFrame = "mce_0_ifr";
    private By textArea = By.id("tinymce");
    private By decreaseIdentButton = By.cssSelector("button[aria-label=\"Increase indent\"]");

    public WysiWygEditorPage(WebDriver driver){
        this.driver = driver;
    }
//mudando o contexto para o iframe selecionado
    public void switchToEditArea(){
        driver.switchTo().frame(editorIdFrame);
    }
//Boa prática: entrar no iframe context, fazer os testes necessários e depois sair do iframe
    public void clearTextArea(){
        switchToEditArea();
        driver.findElement(textArea).clear();
        switchToMainArea();
    }

    public void setTextArea(String text){
        switchToEditArea();
        driver.findElement(textArea).sendKeys(text);
        switchToMainArea();
    }

    public void switchToMainArea(){
        driver.switchTo().parentFrame();
    }

    public void decreaseIdention(){
        driver.findElement(decreaseIdentButton).click();
    }

    public String getTextFromEditor(){
        switchToEditArea();
        String textResult = driver.findElement(textArea).getText();
        switchToMainArea();
        return textResult;

    }

}
