package elements;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AddRemoveElementsTests extends BaseTests {

    @Test
    public void testAddElement(){
        var addRemoveElements = homePage.clickAddRemoveElements();
        addRemoveElements.clickAddElementButton();
        assertTrue(addRemoveElements.getButton().isDisplayed(),"Results text incorrect");
    }

    @Test
    public void testDeleteElement(){
        var addRemoveElements = homePage.clickAddRemoveElements();
        addRemoveElements.clickAddElementButton();
        addRemoveElements.clickDeleteElementButton();
        assertTrue(addRemoveElements.verifyNoElement(),"Results text incorrect");
    }
}
