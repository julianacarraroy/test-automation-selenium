package frames;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FrameTests extends BaseTests {

    @Test
    public void testWysiWyg(){
        var editorPage = homePage.clickwysiWigEditorPage();
        editorPage.clearTextArea();

        String text_1= "Hello ";
        String text_2 = "World!";

        editorPage.setTextArea(text_1);
        editorPage.decreaseIdention();
        editorPage.setTextArea(text_2);

        assertEquals(editorPage.getTextFromEditor(), text_1+text_2, "Text from editor is incorrect");
    }

    @Test
    public void testNestedFrameText() {
        var framesPage = homePage.clickFramesPage();
        assertEquals(framesPage.getLeftFrameText(), "LEFT", "Bottom frame text incorrect");
        assertEquals(framesPage.getBottomFrameText(), "BOTTOM", "Bottom frame text incorrect");
    }

}
