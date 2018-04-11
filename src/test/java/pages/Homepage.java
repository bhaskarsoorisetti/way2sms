package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage
{
	public WebDriver dr;
	
	@FindBy(name="username")
	public WebElement userid;
	
	@FindBy(name="password")
	public WebElement pswd;
	
	@FindBy(id="loginBTN")
	public WebElement loginbtn;
	
	@FindBy(xpath="//*[contains(text(),'Forgot password /')]")
	public WebElement forgotpwd;
	
	@FindBy(xpath="//input[@value='Register Here']")
	public WebElement registerbtn;
	
	public Homepage(WebDriver dr)
	{
		this.dr=dr;
		PageFactory.initElements(dr, this);
	}
	
	public void filluserid(String usrid)
	{
		userid.sendKeys(usrid);
	}
	
	public void fillpwd(String pwd)
	{
		pswd.sendKeys(pwd);
		
	}
	
	public void clicklogin()
	{
		loginbtn.click();
	}
	
	public void clickforgotpwd()
	{
		forgotpwd.click();
	}
	
	public void clickregisterbtn()
	{
		registerbtn.click();
	}

}
