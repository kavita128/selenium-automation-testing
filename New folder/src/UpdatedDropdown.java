import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    WebDriver driver=new ChromeDriver();
    driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
    driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
    System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
    
    
    //count the number of checkbox
    System.out.println(driver.findElements(By.cssSelector("div[id='discount-checkbox'] div")).size());
    
    //or use the common in all 6 checkox input[type='checkbox']
    driver.findElement(By.id("divpaxinfo")).click();
    System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
    Thread.sleep(2000L);
  /* int i=1;
    while(i<5)
    {
    driver.findElement(By.id("hrefIncAdt")).click();
    i++;
    }*/
    for(int i=1;i<5;i++)
    {
    	driver.findElement(By.id("hrefIncAdt")).click();
    }
    driver.findElement(By.id("btnclosepaxoption")).click();
    System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
    
	}
}


