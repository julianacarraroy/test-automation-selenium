package menus;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContextMenuTexts extends BaseTests {

    @Test
    public void testRightClick() {
        var menuPage = homePage.clickContextMenu();
        menuPage.rightClickInBox();
        String message = menuPage.getPopUpText();
        menuPage.acceptPopUp();
        Assert.assertEquals(message, "You selected a context menu", "Popup message incorrect");
    }
}
