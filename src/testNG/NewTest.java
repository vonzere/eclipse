package testNG;

import static org.testng.AssertJUnit.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.sun.tools.javac.util.Assert;

public class NewTest {
  @Test
  public void f() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://website.com/sign-in");
		driver.manage().window().maximize();
		String x = driver.getTitle();
		System.out.println(x);
		Assert.assertEquals(x,x);
  }
  
  
  @Test
  public void f1() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://website.com/sign-in");
		driver.manage().window().maximize();
		String x = driver.getTitle();
		System.out.println(x);
		Assert.assertEquals(x,"kush");
  }
}
