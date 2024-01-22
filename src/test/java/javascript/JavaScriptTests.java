package javascript;

import base.BaseTests;
import org.testng.annotations.Test;

public class JavaScriptTests extends BaseTests {

    @Test
    public void testScrollToTable(){
        homePage.clickLargeAndDeepDom().scrollElementToTable();
    }

    @Test
    public void testScrollToFifthParagraph(){
        homePage.clickInfiniteScroll().scrollToParagraph(5);

    }
}
