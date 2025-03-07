package seleniumpractice;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.AcceptedW3CCapabilityKeys;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v130.storage.model.AttributionReportingAggregationKeysEntry;
import org.openqa.selenium.interactions.Actions;

public class TextBoxPractice {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Testing\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");

		driver.manage().window().maximize();
		WebElement nameBox = driver.findElement(By.id("j_idt88:name"));
		nameBox.sendKeys("Madhusuthanan G");

		WebElement appendBox = driver.findElement(By.id("j_idt88:j_idt91"));
		appendBox.sendKeys(" City");

		WebElement disabledBox = driver.findElement(By.id("j_idt88:j_idt93"));
		boolean enabled = disabledBox.isEnabled();
		System.out.println(enabled);

		WebElement clearText = driver.findElement(By.id("j_idt88:j_idt95"));
		clearText.clear();

		WebElement reterive = driver.findElement(By.id("j_idt88:j_idt97"));
		String get = reterive.getAttribute("value");
		System.out.println(get);

		WebElement emailBox = driver.findElement(By.id("j_idt88:j_idt99"));
		emailBox.sendKeys("maddy@gmail.com"+Keys.TAB);


		WebElement textBox = driver.findElement(By.className("ql-editor"));
		textBox.sendKeys("Madhu");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_B);
		textBox.sendKeys("Suthanan");


		Actions a = new Actions(driver);
		a.moveToElement(textBox).click().doubleClick().build().perform();

		Thread.sleep(2000);
		WebElement fontDropDown = driver.findElement(By.className("ql-picker-label"));
		fontDropDown.click();

		Thread.sleep(2000);
		WebElement fontChoose = driver.findElement(By.xpath("//*[@id=\'ql-picker-options-0\']/span[2]"));
		fontChoose.click();

		Thread.sleep(2000);
		WebElement fontSizeDropDown = driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt103_toolbar\']/span[1]/span[2]/span[1]"));
		fontSizeDropDown.click();

		Thread.sleep(2000);
		WebElement fontSizeSelector = driver.findElement(By.xpath("//*[@id=\'ql-picker-options-1\']/span[3]"));
		fontSizeSelector.click();

		Thread.sleep(2000);
		WebElement bold = driver.findElement(By.className("ql-bold"));
		bold.click();

		Thread.sleep(2000);
		WebElement italic = driver.findElement(By.className("ql-italic"));
		italic.click();

		Thread.sleep(2000);
		WebElement underline = driver.findElement(By.className("ql-underline"));
		underline.click();

		Thread.sleep(2000);
		WebElement strike = driver.findElement(By.className("ql-strike"));
		strike.click();

		Thread.sleep(2000);
		WebElement colorDropdown = driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt103_toolbar\']/span[3]/span[1]/span[1]"));
		colorDropdown.click();

		Thread.sleep(2000);
		WebElement colorSelector = driver.findElement(By.xpath("//*[@id=\'ql-picker-options-2\']/span[7]"));
		colorSelector.click();

		Thread.sleep(2000);
		textBox.click();

		Thread.sleep(2000);
		a.moveToElement(textBox).click().doubleClick().build().perform();
		WebElement backgroundColorDropdown = driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt103_toolbar\']/span[3]/span[2]/span[1]"));
		backgroundColorDropdown.click();

		Thread.sleep(2000);
		WebElement backgroundColor = driver.findElement(By.xpath("//*[@id=\'ql-picker-options-3\']/span[9]"));
		backgroundColor.click();
		textBox.click();

		Thread.sleep(2000);
		WebElement listButton = driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt103_toolbar\']/span[6]/button[1]"));
		listButton.click();

		Thread.sleep(2000);
		textBox.sendKeys(Keys.ENTER+"Class at 12PM");

		WebElement pressEnter = driver.findElement(By.id("j_idt106:thisform:age"));
		Thread.sleep(1000);
		pressEnter.click();


	}

}
