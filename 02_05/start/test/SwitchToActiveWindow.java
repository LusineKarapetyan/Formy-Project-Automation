import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToActiveWindow {
    public static void main(String[] args) {

        // Set the property for webdriver.chrome.driver to be the location to your local download of chromedriver
        System.setProperty("webdriver.chrome.driver", "D:/soft/chromedriver_win32/chromedriver.exe");

        // Create new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        // And now use this to visit the website being tested
        driver.get("https://formy-project.herokuapp.com/switch-window");

        // Find the tab button element by its id and click on it
        WebElement newTabButton = driver.findElement(By.id("new-tab-button"));
        newTabButton.click();

        // Define new variable for the driver to get original handle window
        String originalHandle = driver.getWindowHandle();

        // For loop to focus on switching to the second tab that's open
        for(String handle1: driver.getWindowHandles()){
            driver.switchTo().window(handle1);
        }

        // Switching back to the original window
        driver.switchTo().window(originalHandle);

        // Close the browser
        driver.quit();
    }
}
