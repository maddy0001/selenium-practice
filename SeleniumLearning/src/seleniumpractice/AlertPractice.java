package seleniumpractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertPractice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Testing\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		
		WebElement simpleAlert = driver.findElement(By.id("j_idt88:j_idt91"));
		simpleAlert.click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		WebElement confirmAlert = driver.findElement(By.id("j_idt88:j_idt93"));
		confirmAlert.click();
		alert.accept();
		Thread.sleep(2000);
		confirmAlert.click();
		alert.dismiss();
		
		WebElement sweetAlert = driver.findElement(By.id("j_idt88:j_idt95"));
		sweetAlert.click();
		String text2 = driver.findElement(By.xpath("//span[text()='Dialog']")).getText();
		System.out.println(text2);
		Thread.sleep(5000);
		WebElement from = driver.findElement(By.id("j_idt88:j_idt96_title"));
		Actions a = new Actions(driver);
		WebElement dismissButton = driver.findElement(By.xpath("//span[text()='Dismiss']"));
		dismissButton.click();
		
		WebElement sweetModalAlert = driver.findElement(By.id("j_idt88:j_idt100"));
		sweetModalAlert.click();
		WebElement closeButton = driver.findElement(By.xpath("(//a[@aria-label='Close'])[2]"));
		Thread.sleep(2000);
		closeButton.click();
		
		WebElement promptAlert = driver.findElement(By.id("j_idt88:j_idt104"));
		promptAlert.click();
		String text3 = alert.getText();
		System.out.println(text3);
		alert.sendKeys("Yukesh Balaji");
		Thread.sleep(2000);
		alert.accept();
		Thread.sleep(2000);
		promptAlert.click();
		alert.dismiss();
		
		WebElement sweetAlertConfirmation = driver.findElement(By.id("j_idt88:j_idt106"));
		sweetAlertConfirmation.click();
		WebElement yes = driver.findElement(By.id("j_idt88:j_idt108"));
		yes.click();
		Thread.sleep(2000);
		sweetAlertConfirmation.click();
		Thread.sleep(1000);
		WebElement no = driver.findElement(By.id("j_idt88:j_idt109"));
		no.click();
		Thread.sleep(2000);
		sweetAlertConfirmation.click();
		Thread.sleep(1000);
		WebElement close = driver.findElement(By.xpath("(//a[@aria-label='Close'])[4]"));
		close.click();
		
		WebElement maximizeAndMinimize = driver.findElement(By.id("j_idt88:j_idt111"));
		maximizeAndMinimize.click();
		String text = driver.findElement(By.xpath("//span[text()='Min and Max']")).getText();
		System.out.println(text);
		String text1 = driver.findElement(By.xpath("//p[text()='I am Sweet Alert and can be maximized or minimized. By the way, am not a new window.']")).getText();
		System.out.println(text1);
		Thread.sleep(2000);
		WebElement minusButton = driver.findElement(By.xpath("(//a[@role='button'])[5]"));
		minusButton.click();
		Thread.sleep(2000);
		minusButton.click();
		Thread.sleep(2000);
		WebElement maximizeButton = driver.findElement(By.xpath("(//a[@role='button'])[4]"));
		maximizeButton.click();
		Thread.sleep(2000);
		maximizeButton.click();
		Thread.sleep(2000);
		WebElement closeButtonofMinandMax = driver.findElement(By.xpath("(//a[@aria-label='Close'])[3]"));
		closeButtonofMinandMax.click();
		
	}

}
