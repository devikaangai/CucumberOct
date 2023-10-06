package StepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

    public static WebDriver driver;

    @Given("user is on login page")
    public void user_is_on_login_page() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
driver.get("http://whiteboxqa.com/login.php");


    }
    @When("user enters id and password")
    public void user_enters_id_and_password() {
        driver.findElement(By.id("username")).sendKeys("devikaangai@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Whitebox@1234");


    }
    @And("click on login button")
    public void click_on_login_button() {
        driver.findElement(By.id("login")).click();

    }
    @Then("user should logged on")
    public void user_should_logged_on() {
        driver.findElement(By.id("logo"));

    }

}
