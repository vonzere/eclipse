package victor;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class verify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/url?q=https://github.com/edureka-devops/projCert.git&sa=D&source=hangouts&ust=1529594204947000&usg=AFQjCNHLi_-tQcahU0SXmK-dbQu3oSMTqQ");
		driver.findElement(By.linkText("https://github.com/edureka-devops/projCert.git")).click();
		driver.manage().window().maximize();
		driver.findElement(By.linkText("About")).click();
		
		
			

	}

}
