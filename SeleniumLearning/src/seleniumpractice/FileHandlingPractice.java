package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileHandlingPractice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Testing\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/file.xhtml");
		
		WebElement uploadButton = driver.findElement(By.id("j_idt88:j_idt89_input"));
		uploadButton.sendKeys("C:\\Testing\\TestData\\ScreenshotPractice.java");
		
		WebElement uploadImageButton = driver.findElement(By.id("j_idt97:j_idt98_input"));
		uploadImageButton.sendKeys("C:\\Testing\\TestData\\Madhusuthanan G_Software Testing.jpeg");
		Thread.sleep(2000);
		WebElement UploadButtton = driver.findElement(By.xpath("//span[text()='Upload']"));
		UploadButtton.click();
		
		WebElement downloadButton = driver.findElement(By.id("j_idt93:j_idt95"));
		downloadButton.click();

	}

}
