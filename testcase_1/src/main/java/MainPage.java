import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class MainPage {
    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }
    private By userName = By.xpath(" //*[@id='identification']");
    private By userPassword = By.xpath(" //*[@id='password']");
    private By signInButton = By.xpath(" //*[@id='ember433']/div/form/div[2]/button");
    private By errorMessage = By.xpath("//div[@id=\"ember433\"]/div/form/div[2]/div[1]");
    private By signInMainPage = By.xpath("//form[@role=\"form\"]/div[2]/h2[text() = 'please sign in']");


    public PatientListing signIn (){
        driver.findElement(signInButton).click();
        return new PatientListing(driver);
    }

    public MainPage typeUserName (String name){
        driver.findElement(userName).sendKeys(name);
        return this;
    }

    public MainPage typePassword (String password){
        driver.findElement(userPassword).sendKeys(password);
        return this;
    }

    public PatientListing registerUser (String name, String password){
        this.typeUserName(name);
        this.typePassword(password);
        this.signIn();
        return new PatientListing(driver);
    }

    public MainPage invalidCredentials(String name, String password){
        this.typeUserName(name);
        this.typePassword(password);
        this.signIn();
        return new MainPage(driver);

    }

    public String getErrorMessage(){
        return driver.findElement(errorMessage).getText();
    }

    public String getTextSignInForm(){
        return driver.findElement(signInMainPage).getText();
    }

}
