package pl.coderslab.stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ExamplesStepsDefinition {
    public String keyword;
        private WebDriver driver;
        @Given("User is signed up at https://prod-kurs.coderslab.pl/index.php")
        public void openGoogleSearch(){
            System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://prod-kurs.coderslab.pl/index.php");
        }

        @When("a keyword (.*) is entered in input field")
        public void enterKeyword(String keyword) {
            // Znajdź element wprowadzania tekstu na podstawie jego nazwy
            WebElement address = driver.findElement(By.name("address1"));
            // Wyczyść tekst zapisany w elemencie
           address.clear();
            // Wpisz informacje do wyszukania
            address.sendKeys(keyword);
            // Prześlij formularz
            address.submit();

        }

        @Then("the first one should contain (.*)")
        public void theFirstOneShouldContainKeyword(String expectedText) {
            System.out.println(expectedText);
        }

        @And("close browser")
        public void closeBrowser(){
            driver.quit();
        }
    }
