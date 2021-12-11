import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElement {
    public static void main(String[] args) {

        // Set the property for webdriver.chrome.driver to be the location to your local download of chromedriver
        System.setProperty("webdriver.chrome.driver", "D:/soft/chromedriver_win32/chromedriver.exe");

        // Create new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        // And now use this to visit the website being tested
        driver.get("https://formy-project.herokuapp.com/scroll");

        // Find the name button element by its name
        WebElement name = driver.findElement(By.id("name"));

        // Define new actions and move to that element (Actions class is being imported), then a name is being typed
        Actions actions = new Actions(driver);
        actions.moveToElement(name);
        name.sendKeys("Lusine Karapetyan");

        // Find the date field and enter value
        WebElement date = driver.findElement(By.id("date"));
        date.sendKeys("11/12/2021");

        // Close the browser
        driver.quit();
    }
}
