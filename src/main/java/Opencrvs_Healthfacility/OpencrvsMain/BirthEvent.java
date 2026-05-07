package Opencrvs_Healthfacility.OpencrvsMain;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BirthEvent {
   WebDriverWait wait;
   WebDriver driver;
   public BirthEvent(WebDriver driver) {
	   this.driver=driver;
	   PageFactory.initElements(driver, this);
	   wait = new WebDriverWait(driver, Duration.ofSeconds(20));
   }
   @FindBy(id="header-new-event")
   WebElement plus;
   @FindBy(xpath="//label[@for='eventType_birth']//span[1]")
   WebElement birthRadioBtn;
   @FindBy(id="continue")
   WebElement continueBtn;
   public void buttonclick() {
	   wait.until(ExpectedConditions.visibilityOf(plus));
       wait.until(ExpectedConditions.elementToBeClickable(plus));
	   plus.click();
   }
   public void selectBirth() {
	    wait.until(ExpectedConditions.elementToBeClickable(birthRadioBtn));
	    birthRadioBtn.click();
	    wait.until(ExpectedConditions.elementToBeClickable(continueBtn));
	    continueBtn.click();
	}
   
}
