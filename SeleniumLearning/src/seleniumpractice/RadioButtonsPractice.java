package seleniumpractice;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonsPractice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Testing\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");

		WebElement chrome = driver.findElement(By.xpath("//label[@for='j_idt87:console1:0']"));
		chrome.click();

		WebElement unselectable = driver.findElement(By.xpath("//label[text()='Bengaluru']"));
		unselectable.click();
		Thread.sleep(1000);
		unselectable.click();
		
		WebElement defaultSelectedButton = driver.findElement(By.xpath("//label[@for='j_idt87:console2:2']"));
		boolean selected = defaultSelectedButton.isSelected();
		System.out.println(selected);
		
		WebElement age = driver.findElement(By.xpath("//label[text()='41-60 Years']"));
			age.click();

	}
}

