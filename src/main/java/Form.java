import PO.ConfirmationFormPage;
import PO.FormPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import static org.junit.Assert.assertEquals;


public class Form {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");
        driver.manage().window().maximize();

        FormPage formPage = new FormPage();
        formPage.submitForm(driver);

        ConfirmationFormPage confirmationFormPage = new ConfirmationFormPage();
        confirmationFormPage.waitForAlertBanner(driver);

        assertEquals("The form was successfully submitted!", confirmationFormPage.getALertBannerText(driver));


        driver.quit();

    }


}
