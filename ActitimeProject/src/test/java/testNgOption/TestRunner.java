package testNgOption;

import com.actitime.util.BaseUtils;
import com.actitime.util.ReportUtil;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features", 
glue="stepDefinations",monochrome=true, dryRun=false,tags="@actitime")
public class TestRunner extends BaseUtils{

}
