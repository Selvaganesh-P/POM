package functionality;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import elements.E;


public class F {

	@Test
	public void itime () throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
		
		WebDriver d = new ChromeDriver();
		
		d.get("https://www.myhcl.com");
		
		d.manage().window().maximize();
		
		Thread.sleep(20000);

		E.email(d).sendKeys("selvaganesh.p@hcl.com");
		
		E.next(d).click();
		
		Thread.sleep(40000);
		
		E.yes(d).click();
		
		Thread.sleep(20000);
		
		E.searchbox(d).sendKeys("itime");
		
		Thread.sleep(10000);

		Actions A1 = new Actions(d);
		
		A1.moveToElement(E.dropdown(d)).click().build().perform();
		
		Thread.sleep(30000);
		
		E.time(d).sendKeys("9");
		
		Thread.sleep(3000);
		
		E.save(d).click();
		
		
	}
	
}
