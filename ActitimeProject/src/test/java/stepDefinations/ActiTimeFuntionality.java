package stepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.actitime.util.ReportUtil;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ActiTimeFuntionality extends ReportUtil {

	WebDriver driver;
	@Before("@actitime")
	
	public void setUp(Scenario scenario) {
		String scenarioName = getScenario(scenario);
		createTest(scenarioName);
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}
	@Given("^Verifying and validating login and logout actiTime functionality$")
	public void Verifying_and_validating_login_and_logout_actiTime_functionality() throws InterruptedException{
		createNode("Given", "User is on Landing Page of Actitime");
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("logoutLink")).click();
		logStatus("info", "Verifying and validating login and logout actiTime completed");
	}

	@After("@actitime")
	public void KillBrowser() {
		driver.quit();
		killReport();
	}
}
