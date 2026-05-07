package Opencrvs_Healthfacility.OpencrvsMain;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_002Verification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       WebDriverManager.chromedriver().setup();
       WebDriver driver = new ChromeDriver();
       // Wait for verification page elements this explicit wait
       Verification verify=new Verification(driver);
       verify.Verifyinto("000000");
	}
}
