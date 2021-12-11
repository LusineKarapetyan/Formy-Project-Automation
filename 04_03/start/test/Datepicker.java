import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Datepicker {
    public static void main(String[] args) {

        // Set the property for webdriver.chrome.driver to be the location to your local download of chromedriver
        System.setProperty("webdriver.chrome.driver", "D:/soft/chromedriver_win32/chromedriver.exe");

        // Create new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        // And now use this to visit the website being tested
        driver.get("https://formy-project.herokuapp.com/datepicker");

        // find the date field by id, send keys with dates and press the enter (importing Keys class)
        WebElement dateField = driver.findElement(By.id("datepicker"));
        dateField.sendKeys("03/03/2021");
        dateField.sendKeys(Keys.RETURN);

        // Close the browser
        driver.quit();
    }
}