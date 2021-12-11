import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToAlert {
    public static void main(String[] args) {

        // Set the property for webdriver.chrome.driver to be the location to your local download of chromedriver
        System.setProperty("webdriver.chrome.driver", "D:/soft/chromedriver_win32/chromedriver.exe");

        // Create new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        // And now use this to visit the website being tested
        driver.get("https://formy-project.herokuapp.com/switch-window");

        // Find the alert button element by its name and click on it
        WebElement alertButton = driver.findElement(By.id("alert-button"));
        alertButton.click();

        // Using Alert class to define a new alert object and switch to the driver's focus to that object and then accept and close that alert
        Alert alert = driver.switchTo().alert();
        alert.accept();

        // Close the browser
        driver.quit();
    }
}
