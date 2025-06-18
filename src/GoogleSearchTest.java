import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("\"http://www.google.com\"");
		String title = driver.getTitle();
		if(title.equals("Google"))
		{ 
			System.out.println("pass:Title is Google");
			
		}
		else 
		{
			System.out.println("Fail: Title is not Google");
		}
		String url= driver.getCurrentUrl();
		if(url.contains("google.co.in"))
		{
			System.out.println("pass: url contains co.in");
		}
		else
		{
			System.out.println("fail: url doesn't contains co.in");
		}
		

	}

}
