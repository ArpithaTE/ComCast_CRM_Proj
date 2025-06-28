package baseClass.Implementation.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import baseUtility.Base1Class;

public class OwnTest extends Base1Class {
	@Test
	public void createOppotunityTest() throws Exception {
		WebDriver driver = new ChromeDriver();

		driver.quit();

	}

}
