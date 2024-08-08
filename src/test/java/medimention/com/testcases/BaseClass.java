package medimention.com.testcases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	public static WebDriver driver;
	@BeforeClass
	public void SetUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.medimention.com/");
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		//driver.findElement(By.xpath("//a[text()='Home']"));
	}
	
	//@AfterClass
	public void teardown()
	{
		driver.quit();
	}
	
}
