package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropPractice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Testing\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/drag.xhtml");
		
		
		WebElement from = driver.findElement(By.id("form:conpnl"));
//		WebElement to = driver.findElement(By.xpath("(//div[@class='card'])[2]"));
		Actions a = new Actions(driver);
		a.clickAndHold(from).moveByOffset(150, 0).release().perform();
		Thread.sleep(2000);
		
		WebElement from1 = driver.findElement(By.id("form:drag"));
		WebElement to1 = driver.findElement(By.id("form:drop"));
		//a.clickAndHold(from1).moveToElement(to1).release(to1).build().perform();
		a.dragAndDrop(from1, to1).build().perform();
		Thread.sleep(5000);
	
		WebElement fromColumn = driver.findElement(By.id("form:j_idt94:j_idt95"));
		WebElement toColumn = driver.findElement(By.id("form:j_idt94:j_idt99"));
		a.dragAndDrop(fromColumn, toColumn).build().perform();
		Thread.sleep(5000);
		
		WebElement fromRow = driver.findElement(By.xpath("(//td[text()='Gaming Set'])[2]"));
		WebElement toRow = driver.findElement(By.xpath("(//td[text()='Blue T-Shirt'])[2]"));
		a.dragAndDrop(fromRow, toRow).build().perform();
		Thread.sleep(2000);
		
        WebElement resizeHandleWidth = driver.findElement(By.xpath("//div[contains(@class,'ui-resizable-handle')]"));
        a.clickAndHold(resizeHandleWidth).moveByOffset(75, 0).release().perform();
        Dimension size = resizeHandleWidth.getSize();
        System.out.println(size.getHeight() +" " +size.getWidth());
        Thread.sleep(2000);
        WebElement resizeHandleHeight = driver.findElement(By.className("ui-resizable-s"));
        a.clickAndHold(resizeHandleHeight).moveByOffset(0, 5).build().perform();
        
        
        WebElement startButton = driver.findElement(By.id("form:j_idt119"));
        startButton.click();
        Thread.sleep(5000);
        WebElement cancelButton = driver.findElement(By.id("form:j_idt120"));
        cancelButton.click();
        
        WebElement slider = driver.findElement(By.xpath("(//span[@tabindex=0])[1]"));
        a.dragAndDropBy(slider, 125, 0).build().perform();
        Thread.sleep(5000);
        WebElement slider1 = driver.findElement(By.xpath("(//span[@tabindex=0])[2]"));
        a.clickAndHold(slider1).moveByOffset(15, 0).release().perform();
        Thread.sleep(3000);
        a.dragAndDropBy(slider1, -25, 0).build().perform();
		
	}

}
