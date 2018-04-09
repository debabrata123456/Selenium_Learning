import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Title_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String actual_titile;
		String expected_titile="Google";
		System.setProperty("webdriver.gecko.driver", "/Users/debabratabaidya/Documents/Selenium/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in/?gfe_rd=cr&dcr=0&ei=7UPLWoyzLseCvATj3b3YBQ");
		actual_titile=driver.getTitle();
		if(expected_titile.contentEquals(actual_titile))
		{
			System.out.println("Tiitle is same");
		}
		else {System.out.println("Titile is not same");}
		driver.findElement(By.xpath("//*[@id='lst-ib']")).isEnabled();
		
	}

}
