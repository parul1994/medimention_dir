package medimention.com.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import medimention.com.pageobject.Login_page;

public class TC_LOGIN_Test_002 extends BaseClass {
	
	@Test
	public void Logintest()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Login_page l1=new Login_page(driver);
		l1.homebtn();
		l1.Loginbtn();
		l1.Username("parul1234");
		l1.password("parul@1234");
		l1.submitbtn();
		
		String act_username=driver.findElement(By.xpath("//li[@class='green']//span[@class='user-info']")).getText();
		String exp_username="parul1234";
		System.out.println(act_username);
		System.out.println(exp_username);
		Assert.assertEquals(act_username.replaceAll("\\s+",""), exp_username);
	}

}
