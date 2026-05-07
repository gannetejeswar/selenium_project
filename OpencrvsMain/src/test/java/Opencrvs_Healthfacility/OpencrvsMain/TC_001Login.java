package Opencrvs_Healthfacility.OpencrvsMain;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_001Login {
      public static void main(String args[]) {
    	  WebDriverManager.chromedriver().setup();
    	  WebDriver driver = new ChromeDriver();
    	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	  Login login=new Login(driver);
    	  login.goTo();
    	  login.loginApplication("g.nakaye", "test");
      }
}
