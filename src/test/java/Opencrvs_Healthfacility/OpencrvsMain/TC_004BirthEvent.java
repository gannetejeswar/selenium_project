package Opencrvs_Healthfacility.OpencrvsMain;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_004BirthEvent {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		Login login = new Login(driver);
		login.goTo();
		login.loginApplication("g.nakaye", "test");
		Verification verify = new Verification(driver);
		verify.Verifyinto("000000");
		Thread.sleep(2000);
		PIN pin = new PIN(driver);
		pin.Pinto("1996", "1996");
		BirthEvent birth=new BirthEvent(driver);
		birth.buttonclick();
		birth.selectBirth();

	}
}
