package alert;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class AlertTests extends BaseTests {

    @Test
    public void testAcceptAlert(){
        var alertspage = homePage.clickJavaScriptAlerts();
        alertspage.triggerAlertButton();
        alertspage.alert_clickToAccept();
        assertEquals(alertspage.getResult(), "You successfully clicked an alert",
                "Results text incorrect");
    }
    @Test
    public void testGetTextFromAlert(){
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerConfirmButton();
        String text = alertsPage.alert_getText();
        alertsPage.alert_clickToDismiss();
        assertEquals(text, "I am a JS Confirm", "Results text incorrect");
    }

    @Test
    public void textSetInputTextAlert(){
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerPrompt();
        String text = "Alert Test!!";
        alertsPage.alert_setInput(text);
        alertsPage.alert_clickToAccept();
        assertEquals(alertsPage.getResult(),"You entered: " + text, "Results Text Incorrect");

    }
}
