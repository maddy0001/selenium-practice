package seleniumpractice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxPractice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Testing\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/checkbox.xhtml");
		
		WebElement basicCheckbox = driver.findElement(By.id("j_idt87:j_idt89"));
		basicCheckbox.click();
		
		WebElement notificationBox = driver.findElement(By.id("j_idt87:j_idt91"));
		notificationBox.click();
		Thread.sleep(500);
		notificationBox.click();
		
		WebElement java = driver.findElement(By.xpath("//label[text()='Java']"));
		java.click();
		Thread.sleep(500);
		WebElement python = driver.findElement(By.xpath("//label[text()='Python']"));
		python.click();
		Thread.sleep(500);
		WebElement others = driver.findElement(By.xpath("//label[text()='Others']"));
		others.click();
		Thread.sleep(500);
		WebElement cSharp = driver.findElement(By.xpath("//label[text()='C-Sharp']"));
		cSharp.click();
		Thread.sleep(500);
		cSharp.click();
		
		WebElement tristateBox = driver.findElement(By.id("j_idt87:ajaxTriState"));
		tristateBox.click();
		Thread.sleep(500);
		tristateBox.click();
		Thread.sleep(500);
		tristateBox.click();
		
		WebElement toggleSwitch = driver.findElement(By.id("j_idt87:j_idt100"));
		toggleSwitch.click();
		Thread.sleep(1000);
		
		WebElement disabledBox = driver.findElement(By.id("j_idt87:j_idt102"));
		boolean enabled = disabledBox.isEnabled();
		System.out.println(enabled);
		
		WebElement multipleOptions = driver.findElement(By.id("j_idt87:multiple"));
		multipleOptions.click();
		Thread.sleep(2000);
		WebElement miami = driver.findElement(By.xpath("(//label[text()='Miami'])[2]"));
		miami.click();
		Thread.sleep(2000);
		WebElement london = driver.findElement(By.xpath("(//label[text()='London'])[2]"));
		london.click();
		Thread.sleep(2000);
		WebElement amstedaam = driver.findElement(By.xpath("(//label[text()='Amsterdam'])[2]"));
		amstedaam.click();
		Thread.sleep(2000);

		WebElement closeButton = driver.findElement(By.xpath("//a[@aria-label='Close']"));
		closeButton.click();
		Thread.sleep(2000);
		

	}

}
