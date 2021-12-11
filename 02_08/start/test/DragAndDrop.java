import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
    public static void main(String[] args) {

        // Set the property for webdriver.chrome.driver to be the location to your local download of chromedriver
        System.setProperty("webdriver.chrome.driver", "D:/soft/chromedriver_win32/chromedriver.exe");

        // Create new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        // And now use this to visit the website being tested
        driver.get("https://formy-project.herokuapp.com/dragdrop");

        // Find image and box by id
        WebElement image = driver.findElement(By.id("image"));
        WebElement box = driver.findElement(By.id("box"));

        // Implementing drag and drop function from Actions class
        Actions actions = new Actions(driver);
        actions.dragAndDrop(image,box).build().perform();

        // Close the browser
        driver.quit();
    }
}

