import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class KeyboardAndMouseInput {
    public static void main(String[] args) {

        // Set the property for webdriver.chrome.driver to be the location to your local download of chromedriver
        System.setProperty("webdriver.chrome.driver", "D:/soft/chromedriver_win32/chromedriver.exe");

        // Create new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        // And now use this to visit the website being tested
        driver.get("https://formy-project.herokuapp.com/keypress");

        // Find the name element by its id, click on it and send keys
        WebElement name = driver.findElement(By.id("name"));
        name.click();
        name.sendKeys("Lusine Karapetyan");

        // Find the button by its id and click on it
        WebElement button = driver.findElement(By.id("button"));
        button.click();

        // Close the browser
        driver.quit();
    }
}
