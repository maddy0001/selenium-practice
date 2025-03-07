package seleniumpractice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownPractice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Testing\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");

		WebElement UiTool = driver.findElement(By.xpath("//select[@style='overflow-wrap: break-word; height: 150%;']"));
		UiTool.click();

		Select s = new Select(UiTool);
		s.selectByVisibleText("Cypress");

		WebElement country = driver.findElement(By.id("j_idt87:country_label"));
		country.click();
		driver.findElement(By.xpath("//li[text()='India']")).click();

		Thread.sleep(2000);

		WebElement city = driver.findElement(By.id("j_idt87:city_label"));
		city.click();
		driver.findElement(By.xpath("//li[text()='Bengaluru']")).click();

		WebElement course = driver.findElement(By.className("ui-autocomplete-dropdown"));
		course.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[text()='PostMan']")).click();
		Thread.sleep(5000);
		course.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[text()='AWS']")).click();
		Thread.sleep(5000);
		course.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//li[text()='Selenium WebDriver']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[@class='ui-autocomplete-token-icon ui-icon ui-icon-close'])[2]")).click();
		Thread.sleep(5000);
		
		WebElement language = driver.findElement(By.id("j_idt87:lang_label"));
		language.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[text()='Telugu']")).click();
		Thread.sleep(1000);
		
		WebElement number = driver.findElement(By.id("j_idt87:value_label"));
		number.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[text()='ఒకటి']")).click();
	}

}
