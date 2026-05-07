package Opencrvs_Healthfacility.OpencrvsMain;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Login {
    WebDriver driver;
    WebDriverWait wait;

    public Login(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @FindBy(id = "username")
    WebElement username;

    @FindBy(name = "password")
    WebElement password;

    @FindBy(xpath = "//button[text()='Login']")
    WebElement loginBtn;

    public void loginApplication(String usrname, String passwrd) {

        wait.until(ExpectedConditions.visibilityOf(username));
        username.sendKeys(usrname);

        wait.until(ExpectedConditions.visibilityOf(password));
        password.sendKeys(passwrd);

        wait.until(ExpectedConditions.elementToBeClickable(loginBtn));
        loginBtn.click();
    }

    public void goTo() {
        driver.get("https://register.opencrvs-uganda-qa.idencode.link");
    }
}