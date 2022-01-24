package elements;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class E {

	public static WebElement email (WebDriver d) {

		return d.findElement(By.xpath("//*[@id='i0116']"));

	}

	
	public static WebElement next (WebDriver d) {

		return d.findElement(By.xpath("//*[@id='idSIButton9']"));

	}

	
	public static WebElement yes (WebDriver d) {

		return d.findElement(By.xpath("//*[@id='idSIButton9']"));

	}
	
	
	public static WebElement searchbox (WebDriver d) {

		return d.findElement(By.xpath("//*[@id='txtSearch']"));

	}
	
	
	public static WebElement dropdown (WebDriver d) {

		return d.findElement(By.xpath("//a[text()='iTime (Time Sheet Management System)']"));

	}
	
	
	public static WebElement time (WebDriver d) {

		return d.findElement(By.xpath("//div[@class='submitTime']/input[@type='text']"));

	}
	
	
	public static WebElement save (WebDriver d) {

		return d.findElement(By.xpath("//*[@id='le_apply']"));

	}
	
}
