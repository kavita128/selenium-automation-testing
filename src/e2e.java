import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
		public class e2e {

			public static void main(String[] args) throws InterruptedException {
				// TODO Auto-generated method stub

		
				
				WebDriver driver=new ChromeDriver();
			    driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
			    driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
			    driver.findElement(By.xpath("//a[@value='DEL']")).click();
			    Thread.sleep(2000);
			    //driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
			    driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
			    driver.findElement(By.id("ctl00_mainContent_view_date1")).sendKeys("05/05");
			    
			    if(driver.findElement(By.id("Div1")).getDomAttribute("style").contains("0.5"))
			    { 
			    	System.out.println("it's disabled");
			    	Assert.assertTrue(true);
			    }
			    else 
			    {
			    	Assert.assertTrue(false);
			    }
			    driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
			    
			    driver.findElement(By.id("divpaxinfo")).click();
			    System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
			    Thread.sleep(2000L);
			   int i=1;
			    while(i<5)
			    {
			    driver.findElement(By.id("hrefIncAdt")).click();
			    i++;
			    }
			    driver.findElement(By.id("btnclosepaxoption")).click();
			    Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
			    System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
			    driver.findElement(By.cssSelector("input[type='submit']")).click();
			    
			    
			    

		}
		

	}


