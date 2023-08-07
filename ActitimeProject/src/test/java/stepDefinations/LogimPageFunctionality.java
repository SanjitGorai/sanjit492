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

public class LogimPageFunctionality extends ReportUtil{

	WebDriver driver;
	
	@Before("@demo")
	public void setUp(Scenario scenario) {
		String scenarioName = getScenario(scenario);
		createTest(scenarioName);
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	@Given("^Verifying amd Validatimg logim fumctiomality$")
    public void Verifying_amd_Validatimg_logim_fumctiomality(){
		createNode("Given", "Verifying amd Validatimg logim fumctiomality");
       driver.get("https://demo.actitime.com/login.do");
       logStatus("info", "user is on landing page");
    }
	
	@After("@demo")
	public void KillBrowser() {
		driver.quit();
		killReport();
	}
}
