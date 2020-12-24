import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewMedicationRequest {

    private WebDriver driver;

    public NewMedicationRequest(WebDriver driver) {
        this.driver = driver;
    }

    private By patientField = By.xpath("//div[@class ='row']//div[1]//input[2]");
    private By visitField = By.xpath("//div[@id='ember4496']//select[@id=\"visit-ember4492\"]");
    private By medicationField = By.xpath("//div[@id='ember4502']//input[@id=\"inventoryItemTypeAhead-ember4498\"]");
    private By prescriptionField = By.xpath("//div[@id='ember4508']//textarea[@id=\"prescription-ember4504\"]");
    private By prescriptionDateField = By.xpath("//div[@id='ember4513']//input[@id=\"display_prescriptionDate-ember4509\"]");
    private By quantityRequestedField = By.xpath("//div[@id='ember4518']//input[@id=\"quantity-ember4514\"]");
    private By refillsRequestedField = By.xpath("//div[@id='ember4523']//input[@id=\"refills-ember4519\"] ");

    private By buttonAdd = By.xpath("//div[@class='panel-footer']//button[@class=\"btn btn-primary on-white disabled-btn\"]");

    public NewMedicationRequest typePatient (String name){
        driver.findElement(patientField).sendKeys(name);
        return this;
    }


//    public NewMedicationRequest typeVisit (String name){
//        driver.findElement(visitField).sendKeys(name);
//        return this;
//    }

    public NewMedicationRequest typeMedication (String name){
        driver.findElement(medicationField).sendKeys(name);
        return this;
    }

    public NewMedicationRequest typePrescription (String name){
        driver.findElement(prescriptionField).sendKeys(name);
        return this;
    }

//    public NewMedicationRequest typePrescriptionDate (String name){
//        driver.findElement(prescriptionDateField).sendKeys(name);
//        return this;
//    }

    public NewMedicationRequest typeQuantityRequested (String name){
        driver.findElement(quantityRequestedField).sendKeys(name);
        return this;
    }

    public NewMedicationRequest typeRefills (String number){
        driver.findElement(refillsRequestedField).sendKeys(number);
        return this;
    }





}
