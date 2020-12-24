import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PatientListing {


    private WebDriver driver;

    public PatientListing(WebDriver driver) {
        this.driver = driver;
    }

    private By cogWheel = By.xpath("//span[@class='mega-octicon octicon-gear']");
    private By logoutLink = By.xpath("//nav [@class='settings-nav']/a[@class='logout']");
    private By logoPatientPage = By.xpath("//div[@id=\"ember433\"]/div/div[1]/div[1]/h1[text() = 'Patient Listing']");


    public void clickCogWheel () {
        driver.findElement(cogWheel).click();

    }
    public void clickLogoutLink() {
        driver.findElement(logoutLink).click();

    }

    public MainPage logOut(){
        this.clickCogWheel();
        this.clickLogoutLink();
        return new MainPage(driver);
    }

    public String getTextLogoPatient(){
        return driver.findElement(logoPatientPage).getText();
    }

}
