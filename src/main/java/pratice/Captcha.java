package pratice;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.util.LoadLibs;

public class Captcha {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","G://selenium practice//chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("http://site21.way2sms.com/content/index.html");
		Thread.sleep(5000);
		dr.findElement(By.xpath("//input[@value='Register Here']")).click();
		Thread.sleep(10000);
		WebElement e=dr.findElement(By.xpath("//*[@id='capImg']"));
		String val=e.getAttribute("src");
	    System.out.println(val);
		File f= new File(val+".png");
		File tessfolder=LoadLibs.extractTessResources("tessdata");
		ITesseract obj=new Tesseract();
		obj.setDatapath(tessfolder.getAbsolutePath());
		String res=obj.doOCR(f);
		System.out.println(res);
	}

}
