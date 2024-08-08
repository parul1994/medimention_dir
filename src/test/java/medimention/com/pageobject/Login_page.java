package medimention.com.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.CacheLookup;

public class Login_page {
	
	WebDriver driver;

	public Login_page(WebDriver ldriver)
	{
		driver=ldriver;
		PageFactory.initElements(ldriver,this);
	}
	
	@FindBy(xpath="//a[text()='Home']")
	@CacheLookup
	WebElement  homebtn;
	
	@FindBy(xpath="//a[text()='Login']")
	@CacheLookup
	WebElement loginbtn;
	
	@FindBy(xpath="//input[@id='UserUsername']")
	@CacheLookup
	WebElement usernamebtn;
	
	@FindBy(xpath="//input[@id='UserPassword']")
	@CacheLookup
	WebElement pswdbtn;
	
	@FindBy(xpath="//span[@class='bigger-110']")
	@CacheLookup
	WebElement lgnbtn;
	
	public void homebtn()
	{
		homebtn.click();
		
	}
	
	
	public void Loginbtn()
	{
		loginbtn.click();
	}
	
	public void Username(String uname)
	{
		usernamebtn.sendKeys(uname);
	}
	
	public void password(String pswrd)
	{
		pswdbtn.sendKeys(pswrd);
	}
	
	public void submitbtn()
	{
		lgnbtn.click();
	}
	
}
