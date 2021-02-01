import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class KeyboardMouseInput {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/keypress");
        driver.manage().window().maximize();

        WebElement name = driver.findElement(By.id("name"));
        name.click();
        name.sendKeys("Musa Alisar");

        WebElement button = driver.findElement(By.id("button"));
        button.click();

        driver.quit();

    }
}
