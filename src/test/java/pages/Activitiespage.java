package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Activitiespage {
	
	public WebDriver driver;
	
	@FindBy(xpath="//li[@id='sendSMS']/child::*")
	public WebElement sendsms;
	
	@FindBy(name="mobile")
	public WebElement mobno;
	
	@FindBy(name="message")
	public WebElement msg;
	
	@FindBy(name="Send")
	public WebElement sendbtn;
	
	
	

}
