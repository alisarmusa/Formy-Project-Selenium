import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");
        driver.manage().window().maximize();

        WebElement newTabButton = driver.findElement(By.id("new-tab-button"));
        newTabButton.click();

        String originalHandle = driver.getWindowHandle();

        for(String handle : driver.getWindowHandles()){
            driver.switchTo().window(handle);
        }

        driver.switchTo().window(originalHandle);

        WebElement alertButton = driver.findElement(By.id("alert-button"));
        alertButton.click();
        
        Alert alert = driver.switchTo().alert();
        alert.accept();

        driver.quit();

    }
}
