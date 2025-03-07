package seleniumpractice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class ButtonPractice {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Testing\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml");
		
		driver.manage().window().maximize();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1000));
		WebElement clickButton= wait.until(ExpectedConditions.elementToBeClickable(By.id("j_idt88:j_idt90")));
		// = driver.findElement(By.id("j_idt88:j_idt90"));
		clickButton.click();

		driver.navigate().back();
		WebElement disabledButton = driver.findElement(By.id("j_idt88:j_idt92"));
		boolean enabled = disabledButton.isEnabled();
		System.out.println(enabled);

		WebElement buttonPosition = driver.findElement(By.id("j_idt88:j_idt94"));
		Point location = buttonPosition.getLocation();
		int x = location.getX();
		int y = location.getY();
		System.out.println("The location of X axis is: "+x+" The location of Y axis is: "+y);

		WebElement buttonColor = driver.findElement(By.id("j_idt88:j_idt96"));
		String backgroundColor = buttonColor.getCssValue("background");
		System.out.println("Background Color: "+backgroundColor);
		String textColor = buttonColor.getCssValue("color");
		System.out.println("Text Color: "+textColor);
		String borderColor = buttonColor.getCssValue("border");
		System.out.println("Border Color: "+borderColor);
		String borderRadius = buttonColor.getCssValue("border-radius");
		System.out.println("Border Radius: "+borderRadius);
		String fontFamily = buttonColor.getCssValue("font-family");
		System.out.println("Font Family: "+fontFamily);

		WebElement buttonSize = driver.findElement(By.id("j_idt88:j_idt98"));
		Dimension size = buttonSize.getSize();
		int height = size.getHeight();
		int width = size.getWidth();
		System.out.println("The Height of the button is: "+height+" The Width of the button is: "+width);

		WebElement buttonHover = driver.findElement(By.id("j_idt88:j_idt100"));
		Actions a = new Actions(driver);
		a.moveToElement(buttonHover).build().perform();

		WebElement imageButton = driver.findElement(By.id("j_idt88:j_idt102:imageBtn"));
		imageButton.click();
		imageButton.click();

		List<WebElement> roundedButtons = driver.findElements(By.className("rounded-button"));
		int countOfButtons = roundedButtons.size();
		System.out.println("The Total Number of Rounded buttons is: "+countOfButtons);

		List<WebElement> totalButtons = driver.findElements(By.tagName("button"));
		int totalButtonss = totalButtons.size();
		System.out.println("The Total Number of buttons in the page is: "+totalButtonss);
		
		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f, new File("C:\\Testing\\TestData\\Button Page.jpeg"));
	}
}
