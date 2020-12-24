import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MedicationRequests {

    private WebDriver driver;

    public MedicationRequests(WebDriver driver) {
        this.driver = driver;
    }

    By medicationLink = By.xpath("//div[@class='scroll-container']//div[@class='primary-nav']//div[5]");
    By newRequest = By.xpath("//div[@class=\"view-action-buttons\"]/button[1]");


    public void medicationPage(){
        driver.findElement(medicationLink).click();
    }
    public NewMedicationRequest newRequestClick(){
        driver.findElement(newRequest).click();
        return new NewMedicationRequest(driver);
    }



}
