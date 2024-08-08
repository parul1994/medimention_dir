package medimention.com.pageobject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration_page {
	
WebDriver driver;
 
	

	public Registration_page(WebDriver ldriver)
	{
	   driver=ldriver;
	   PageFactory.initElements(ldriver,this);
	}
	
	@FindBy(xpath="//a[text()='Home']")
	@CacheLookup
	WebElement  homebtn;
	
	@FindBy(xpath="//a[text()='Join Us']")
	@CacheLookup
	WebElement  joinbtn;
	
	@FindBy(xpath="//span[@class='filter-option pull-left']")
	@CacheLookup
	WebElement slctbtn;
	
	@FindBy(xpath="//span[text()='Doctor']")
	@CacheLookup
	WebElement optbtn;
	
	@FindBy(xpath="//input[@id='DetailName']")
	@CacheLookup
	WebElement d_namebtn;
	
	@FindBy(xpath="//input[@id='UserUsername']")
	@CacheLookup
	WebElement unamebtn;
	
	@FindBy(xpath="//input[@id='UserEmail']")
	@CacheLookup
	WebElement umailbtn;
	
	@FindBy(xpath="//input[@id='UserPassword']")
	@CacheLookup
	WebElement pswdbtn;
	
	@FindBy(xpath="//input[@id='UserPassword1']")
	@CacheLookup
	WebElement repswdbtn;
	
	@FindBy(xpath="//input[@name='terms']")
	@CacheLookup
	WebElement chkboxbtn;
	
	@FindBy(xpath="//span[text()='Register']")
	@CacheLookup
	WebElement regbtn;
	
	public void homebtn()
	{
		homebtn.click();
		
	}
	
	public void Joinbtn()
	{
		joinbtn.click();
	
	}
	
	public void selectbtn()
	{
		slctbtn.click();
	
	}
	
	public void optionbtn()
	{
		optbtn.click();
	}

	public void docname(String name)
	{
		d_namebtn.sendKeys(name);
	}
	
	public void Username(String uname)
	{
		unamebtn.sendKeys(uname);
	}
	
	public void Usermail(String umail)
	{
		umailbtn.sendKeys(umail);
	}
	
	public void Password(String pass)
	{
		pswdbtn.sendKeys(pass);
	}
	
	public void RePassword(String rpass)
	{
		repswdbtn.sendKeys(rpass);
	}
	
	public void checkbox()
	{
		chkboxbtn.click();
	}
	
	public void register()
	{
		regbtn.click();
	}

}
