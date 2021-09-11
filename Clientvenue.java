package Webdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
 
 

public class Clientvenue {
public static void main(String[] args) throws InterruptedException
{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pranoti joge\\Downloads\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver(); 
 //Login Page
	     driver.get("https://stage.clientvenue.com/login");  
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     driver.manage().window().maximize();             
	     driver.findElement(By.id("email")).sendKeys("agency@gmail.co.in");
	     driver.findElement(By.id("password")).sendKeys("1234567");
	     driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[1]/div/div/div/form/button/span")).click();
	     Thread.sleep(3000);
	     System.out.println("Login Page Success");
//Teammate Link
	     driver.navigate().to("https://stage.clientvenue.com/agency/teammates/all");
	     driver.findElement(By.xpath("//button[contains(@class,'MuiButtonBase-root')]//span[@class='MuiButton-label' and text()='New Teammate']")).click();
//Add Teammate
	     driver.findElement(By.id("teammate-name")).sendKeys("Khushbu Vaidya");
	     driver.findElement(By.id("teammate-email")).sendKeys("khushbuV123@gmail.com");
	     System.out.println("Teammate name and email Success"); 
	     Thread.sleep(2000);
//Work
         WebElement ddown=driver.findElement(By.xpath("//*[@id=\"teammate-assign-workspace\"]/div/div[2]/div"));
         ddown.click();
         Thread.sleep(2000);
         //Select work=new Select(ddown);   
	     //work.selectByIndex(1);
 //Role
	    WebElement roledownlist=driver.findElement(By.xpath("//*[@id=\"teammate-role\"]/div/div[2]/div/svg/path"));
	    roledownlist.click();
	    Thread.sleep(2000);
	    //Select Role=new Select(roledownlist);   
	    //Role.selectByIndex(1);
//Click Add button	     
	     driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[3]/button[2]/span")).click();
	     Thread.sleep(3000);
	     System.out.println("Add success");
	     
	     driver.close();
	}
 
}
