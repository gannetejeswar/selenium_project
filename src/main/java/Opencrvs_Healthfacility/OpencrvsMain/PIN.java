package Opencrvs_Healthfacility.OpencrvsMain;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PIN {

    WebDriver driver;
    WebDriverWait wait;

    public PIN(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        PageFactory.initElements(driver, this);
    }

    // Create PIN heading
    @FindBy(id = "title-text")
    WebElement pinTitle;

    // PIN input
    @FindBy(id = "pin-input")
    WebElement pinInput;

    public void Pinto(String pin1, String pin2) throws InterruptedException {

        // Wait until Create a PIN page appears
        wait.until(ExpectedConditions.textToBePresentInElement(
                pinTitle, "Create a PIN"));

        // Small stabilization wait
        Thread.sleep(2000);

        // Enter PIN first time
        pinInput.sendKeys(pin1);

        // Wait for Re-enter PIN step
        Thread.sleep(2000);

        // Enter PIN again
        pinInput.sendKeys(pin2);
    }
}