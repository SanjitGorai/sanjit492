package stepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import com.actitime.util.ReportUtil;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HomePageFunctionality extends ReportUtil{

	WebDriver driver;
	
	@Before("@home")
	public void setUp(Scenario scenario) {
		String scenarioName = getScenario(scenario);
		createTest(scenarioName);
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	@Given("^User is on Landing Page of Actitime$")
    public void user_is_on_landing_page_of_actitime(){
		createNode("Given", "User is on Landing Page of Actitime");
       driver.get("https://demo.actitime.com/login.do");
       logStatus("info", "user is on landing page");
    }
	
	@After("@home")
	public void KillBrowser() {
		driver.quit();
		killReport();
	}
}
