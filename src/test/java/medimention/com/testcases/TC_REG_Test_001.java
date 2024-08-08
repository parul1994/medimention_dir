package medimention.com.testcases;

import java.time.Duration;
import java.util.Random;
import org.junit.ComparisonFailure;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;
import com.github.javafaker.Faker;

import junit.framework.Assert;
import medimention.com.pageobject.Registration_page;

public class TC_REG_Test_001 extends BaseClass {
	
	@Test
	public void RegisterPageTest()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Registration_page r1=new Registration_page(driver);
		Faker fake=new Faker();
		String password=fake.internet().password();
		String fullname=fake.name().fullName();
		String username=RandomStringUtils.random(10,"0123456abcdefghij");
		Random rand=new Random();
		
		
		r1.homebtn();
		r1.Joinbtn();
		r1.selectbtn();
		r1.optionbtn();
		r1.docname(fullname);
		r1.Username(username);
		r1.Usermail(fake.internet().emailAddress());
		r1.Password(password);
		r1.RePassword(password);
		r1.checkbox();
		r1.register();
		
		/*String act_docttitle=driver.findElement(By.xpath("//*[@id='navbar-container']/div[1]/a/small")).getText();
		String exp_doctitle="Medimention | "+ fullname+"'s  User Panel";
		System.out.println(act_docttitle);
		System.out.println(exp_doctitle);
		
		Assert.assertEquals(act_docttitle, exp_doctitle);*/
		
		String act_username=driver.findElement(By.xpath("//li[@class='green']//span[@class='user-info']")).getText();
		String exp_username=username;
		System.out.println(act_username);
		System.out.println(exp_username);
		
		Assert.assertEquals(act_username.replaceAll("\\s+",""), exp_username);
		
	}

}
