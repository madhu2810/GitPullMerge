package GitPulMerge;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoA {

	@Test
	public void sample() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\new\\src\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bluestone.com/");
		driver.manage().window().maximize();
		Actions act = new Actions(driver);

		WebElement ele = driver.findElement(By.xpath("//li[@class='menuparent gold-coins']"));
		act.moveToElement(ele).build().perform();
		
		
		driver.findElement(By.xpath("//span[@data-p='gold-coins-weight-20gms,m']")).click();
	
		Assert.assertEquals(driver.getTitle(), "20 gram 24 KT Gold Coin | BlueStone.com");
		driver.close();
		WebElement ele1=driver.findElement(By.xpath("//section[@id='Delivery Time-form']/span[@class='title style-fill i-right']"));
	    act.moveToElement(ele).build().perform();
	    driver.findElement(By.xpath("//div[@class='form-item ']/span[@data-tagcategory='Delivery Time']")).click();
	    List<WebElement> ele2=driver.findElements(By.xpath("//ul[@id='product_list_ui']/li"));
	    System.out.println(ele2.size());
	    
	}

}
