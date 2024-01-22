package alert;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FilesUploadTests extends BaseTests {

    @Test
    public void testFileUpload(){
        var uploadPage = homePage.clickUploadPage();
        uploadPage.uploadFile("C:\\Users\\jucarraroy\\Documents\\Cursos\\Selenium_java\\webdriver_java\\resources\\chromedriver.exe");
        Assert.assertEquals(uploadPage.getUploadedFiles(),"chromedriver.exe", "Upload Fail");
    }
}
