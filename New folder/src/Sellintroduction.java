import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class Sellintroduction implements WebDriver{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Invoking Browser
		//Chrome - ChromeDriver -> methods close get
		//Firefox- FirefoxDriver -> methods close get
		//Safari- SafariDriver -> methods close get
		//WebDriver close get
		//WebDriver methods + class methods
		//Chromedriver.exe -> chrome browser Selenium Manager
		//step to invoke chrome driver // 
		//Selenium Manager
		//Firefox Launch
		//geckodriver
		
		//WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		// Microsoft Edge
		System.setProperty("webdriver.edge.driver", "C:\\Users\\hp\\Downloads\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
		
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.quit();
		
	}

}
