package Opencrvs_Healthfacility.OpencrvsMain;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class Verification {
    WebDriver driver;
    WebDriverWait wait;

    public Verification(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @FindBy(id = "code")
    WebElement code;

    @FindBy(xpath = "//button[text()='Verify']")
    WebElement verify;

    public void Verifyinto(String code1) {
        wait.until(ExpectedConditions.visibilityOf(code));
        code.sendKeys(code1);

        wait.until(ExpectedConditions.elementToBeClickable(verify));
        verify.click();
    }
}