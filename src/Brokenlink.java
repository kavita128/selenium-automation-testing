import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class Brokenlink {

    public static void main(String[] args) throws MalformedURLException, IOException {
        
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        
        List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
        
        SoftAssert softAssert = new SoftAssert();

        for (WebElement link : links) {
            String url = link.getAttribute("href");

            HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
            conn.setRequestMethod("HEAD");
            conn.connect();
            int respCode = conn.getResponseCode();

            System.out.println("Response Code for " + link.getText() + ": " + respCode);

            // Assertion: fail if response code >= 400
            softAssert.assertTrue(respCode < 400, "Broken Link: " + link.getText() + " with response code: " + respCode);
        }

        // To show all assertion results
        softAssert.assertAll();

        driver.quit();
    }
}