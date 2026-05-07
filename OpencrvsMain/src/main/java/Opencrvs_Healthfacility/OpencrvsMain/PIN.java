package Opencrvs_Healthfacility.OpencrvsMain;

import java.time.Duration;

import org.openqa.selenium.By;
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

    @FindBy(id = "pin-input")
    WebElement pinInput;

    public void Pinto(String pin1, String pin2) throws InterruptedException {

        // Wait for Create PIN page text
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//*[contains(text(),'Create')]")));

        // Small wait for input activation
        Thread.sleep(2000);

        // First PIN
        pinInput.sendKeys(pin1);

        // Wait for Re-enter PIN page
        Thread.sleep(2000);

        // Re-enter PIN
        pinInput.sendKeys(pin2);
    }
}