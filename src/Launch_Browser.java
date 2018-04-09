import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch_Browser {

	// WebDriver driver = new FirefoxDriver();

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/debabratabaidya/Documents/Selenium/geckodriver");
		WebDriver driver = new FirefoxDriver();

		// driver.manage().window().maximize();

		// driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.SECONDS);

		// driver.get("https://phptravels.org/clientarea.php");
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// driver.findElement(By.id("inputEmail")).sendKeys("test");
		// WebElement chkbx =
		// driver.findElement(By.xpath("/html/body/section[3]/div[1]/div/div/form/div[3]/label/input"));
		// chkbx.click();
		// System.out.println("Status of the checkbox is : " +
		// chkbx.isSelected());
		// for (int i = 0; i < 2; i++) {
		// System.out.println("In Loop");
		// chkbx.click();
		// System.out.println("Status of the checkbox is : " +
		// chkbx.isSelected());
		// }
		// System.out.println("End");
		//JavascriptExecutor jsx = (JavascriptExecutor)driver;
		driver.get("https://www.w3schools.com/bootstrap/bootstrap_dropdowns.asp");
		driver.findElement(By.xpath(".//*[@id='menu1']")).click();
		;
		List<WebElement> dd_menu = driver.findElements(By.xpath("//ul[@class='dropdown-menu test']//li/a"));
		for (int i = 0; i < dd_menu.size(); i++) {

			WebElement element = dd_menu.get(i);
			String value = element.getAttribute("innerHTML");
			System.out.println("Value of dd is: " + value);
		}
	}
}
