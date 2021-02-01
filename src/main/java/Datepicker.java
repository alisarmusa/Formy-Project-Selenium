import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/datepicker");
        driver.manage().window().maximize();

        WebElement dateField = driver.findElement(By.id("datepicker"));
        dateField.sendKeys("03/13/1996");
        dateField.sendKeys(Keys.RETURN);


        driver.quit();

    }
}
