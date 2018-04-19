package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Registerpage 
{
	public WebDriver dr;
	
	@FindBy(xpath="//*[@id='male']/i")
	public WebElement male;
	
	@FindBy(xpath="//*[@id='female']/i")
	public WebElement female;
	
	@FindBy(name="name")
	public WebElement fullname;
	
	@FindBy(name="dob")
	public WebElement dateofbirth;
	
	@FindBy(name="email")
	public WebElement emailadd;
	
	@FindBy(name="cemail")
	public WebElement cnfemailadd;
	
	@FindBy(name="city")
	public WebElement city;
	
	@FindBy(name="mno1")
	public WebElement mobileno;
	
	@FindBy(name="captcha")
	public WebElement captcha;
	
	@FindBy(xpath="//*[@id='capImg']")
	public WebElement captchaimg;
	
	@FindBy(xpath="//*[@id='terms']/b")
	public WebElement terms;
	
	@FindBy(xpath="//*[contains(@value,'Verify & Register')]")
	public WebElement verifyandregister;
	
	public Registerpage(WebDriver dr)
	{
		this.dr=dr;
		PageFactory.initElements(dr, this);
	}
	
	public void gender(String gender)
	{
		if(gender.equalsIgnoreCase("male"))
		{
			male.click();
		}
		else
		{
			female.click();
		}
	}
	
	public void fillname(String name)
	{
		fullname.sendKeys(name);
	}
	
	public void filldob(String dob)
	{
		dateofbirth.sendKeys(dob);
	}
	
	public void fillemail(String email)
	{
		emailadd.sendKeys(email);
	}
	
	public void fillcnfemail(String cnfemail)
	{
		cnfemailadd.sendKeys(cnfemail);
	}
	
	public void selectcity(String loc)
	{
		Select sel=new Select(city);
		sel.selectByVisibleText(loc);		
	}
	
	public void fillmobileno(String mobile)
	{
		mobileno.sendKeys(mobile);
	}
	
    public void fillcaptcha() throws Exception
    {
    	Thread.sleep(5000);
    }
    
    public void clickterms()
    {
    	terms.click();
    }
    
    public void clicksubmit()
    {
    	verifyandregister.click();
    }

}
