

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class MainPageTest {

    private WebDriver driver;
    private MainPage mainPage;

    @Before
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\111\\Desktop\\testcase_1\\drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("http://demo.hospitalrun.io/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        mainPage = new MainPage(driver);

    }

    @Test
    public void correctCredentials() {
        PatientListing patientListing = mainPage.registerUser("hr.doctor@hospitalrun.io", "HRt3st12");
        String result = patientListing.getTextLogoPatient();
        Assert.assertEquals("Patient Listing", result);
    }

    @Test
    public void invalidCredentials() {
        mainPage.invalidCredentials("login", "password");

        String message = mainPage.getErrorMessage();
        Assert.assertEquals("Username or password is incorrect.", message);
    }

    @After
    public void tearDown(){

        File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        Date dateNow = new Date();
        SimpleDateFormat format = new SimpleDateFormat("hh_mm_ss");
        String fileName = format.format(dateNow) + ".png";


        try {
            FileUtils.copyFile(screenshot, new File("C:\\Users\\111\\Desktop\\" + fileName));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }


}
