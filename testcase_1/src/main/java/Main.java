import com.sun.corba.se.impl.oa.poa.ActiveObjectMap;
import org.apache.commons.io.FileUtils;
import org.apache.tika.io.FilenameUtils;
import org.junit.runner.JUnitCore;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.TextListener;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

    static WebDriver driver;

    public static void main(String[] args) {

        /*

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\111\\Desktop\\testcase_1\\drivers\\geckodriver.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\111\\Desktop\\testcase_1\\drivers\\chromedriver.exe");
        System.setProperty("webdriver.edge.driver", "C:\\Users\\111\\Desktop\\testcase_1\\drivers\\msedgedriver.exe");

        driver = new FirefoxDriver();

        WebDriverWait wait = (new WebDriverWait(driver, 6));
        driver.get("http://demo.hospitalrun.io/");


        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[@class='form-signin-heading'] ")));

        driver.findElement(By.xpath(" //*[@id='identification']")).sendKeys("hr.doctor@hospitalrun.io");
        driver.findElement(By.xpath(" //*[@id='password']")).sendKeys("HRt3st12");
        driver.findElement(By.xpath(" //*[@id='ember433']/div/form/div[2]/button")).click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        String str = driver.findElement(By.xpath("//div[@id=\"ember433\"]/div/div[1]/div[1]/h1[text() = 'Patient Listing']")).getText();
        System.out.println(str);

        driver.findElement(By.xpath("//div[@class='scroll-container']//div[@class='primary-nav']//div[5]")).click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//div[@class=\"view-action-buttons\"]/button[1]")).click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//div[@class ='row']//div[1]//input[2]")).click();


        WebElement link = driver.findElement(By.xpath("//div[@class ='row']//div[1]//input[2]"));


        Actions actions = new Actions(driver);
        actions.click(link).sendKeys("TestPatient").build().perform(); // Не подтягивались результаты поиска


        List<WebElement> list = driver.findElements(By.xpath("//div[@class ='row']//div[1]//pre[1]"));

        for (WebElement var : list) {
            if (var.getText().equals("Test Patient - P00201")) {
                var.click();
                break;
            }
        }

  */


    }


}
