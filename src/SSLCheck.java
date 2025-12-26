import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

public class SSLCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options= new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		FirefoxOptions option1 = new FirefoxOptions();
		options.setAcceptInsecureCerts(true);
		EdgeOptions option2 = new EdgeOptions();
		options.setAcceptInsecureCerts(true);
		
		WebDriver driver= new ChromeDriver(options);
		driver.get("https://expired.badssl.com");
		System.out.println(driver.getTitle());
		

	}

}
