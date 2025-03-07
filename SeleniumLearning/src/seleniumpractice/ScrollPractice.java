package seleniumpractice;


import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScrollPractice {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Testing\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		
		WebElement searchBar = driver.findElement(By.xpath("//input[@type='text']"));
		searchBar.sendKeys("Boat Airdopes 91");
		Thread.sleep(2000);
		WebElement searchButton = driver.findElement(By.id("nav-search-submit-text"));
		searchButton.click();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,500)");
		
		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f, new File("C:\\Testing\\TestData\\Madhusuthanan G_Software Testing.jpeg"));
		
		WebElement product1 = driver.findElement(By.xpath("(//span[contains(text(), 'boAt Airdopes 91 Prime')])[1]"));
		product1.click();
		
		String windowHandle = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		int size = windowHandles.size();
		System.out.println("The number of windows opend is: "+size);
		for (String string : windowHandles) {
			if(!string.equals(windowHandles)) {
				Thread.sleep(2000);
				driver.switchTo().window(string);	
			}
		}
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,200)");
		
	}

}
