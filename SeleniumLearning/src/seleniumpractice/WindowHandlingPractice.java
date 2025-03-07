package seleniumpractice;


import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingPractice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Testing\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml");
		
		String parentWindow = driver.getWindowHandle();
		
		WebElement openButton = driver.findElement(By.id("j_idt88:new"));
		openButton.click();
		
		Set<String> childWindows = driver.getWindowHandles();
		int size = childWindows.size();
		System.out.println(size);
		for (String windows : childWindows) {
			Thread.sleep(2000);
			driver.switchTo().window(windows);
			
		}
		
		List<WebElement> elements = driver.findElements(By.className("ui-selectbooleancheckbox"));
		for (WebElement webElement : elements) {
			Thread.sleep(1000);
			webElement.click();
		}
		
		WebDriver primaryWindow = driver.switchTo().window(parentWindow);
		String title = primaryWindow.getTitle();
		System.out.println(title);
		
		WebElement multipleTabs = driver.findElement(By.id("j_idt88:j_idt91"));
		multipleTabs.click();
		Set<String> windowHandles = driver.getWindowHandles();
		int size2 = windowHandles.size();
		System.out.println(size2);

		WebElement closeWindow = driver.findElement(By.id("j_idt88:j_idt93"));
		closeWindow.click();
		Set<String> closeWindowHandles = driver.getWindowHandles();
		int size3 = closeWindowHandles.size();
		System.out.println(size3);
		for (String string : closeWindowHandles) {
			if(!string.equals(parentWindow)) {
				driver.switchTo().window(string);
				Thread.sleep(2000);
				driver.close();
			}
		}
		Thread.sleep(2000);
		
		driver.switchTo().window(parentWindow);
		WebElement click = driver.findElement(By.id("j_idt88:j_idt95"));
		Thread.sleep(2000);
		click.click();
		
		Set<String> windowHandles2 = driver.getWindowHandles();
		for (String string : windowHandles2) {
			if (!string.equals(parentWindow)) {
				driver.switchTo().window(string);
				driver.close();
			}
		}
		
		
	}

}
