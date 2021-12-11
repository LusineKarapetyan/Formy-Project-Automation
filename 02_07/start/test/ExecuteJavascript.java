import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class ExecuteJavascript {
    public static void main(String[] args) {

        // Set the property for webdriver.chrome.driver to be the location to your local download of chromedriver
        System.setProperty("webdriver.chrome.driver", "D:/soft/chromedriver_win32/chromedriver.exe");

        // Create new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        // And now use this to visit the website being tested
        driver.get("https://formy-project.herokuapp.com/modal");

        // find modal button by its id and click
        WebElement modalButton = driver.findElement(By.id("modal-button"));
        modalButton.click();

        // executing the close button via javascript
        WebElement closeButton = driver.findElement(By.id("close-button"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", closeButton);

        // Close the browser
        driver.quit();
    }
}
