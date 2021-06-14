package zadaniazaliczeniowe;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class zadaniepierwszeTest{

        private WebDriver driver;

        @Before
        public void setUp() {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://prod-kurs.coderslab.pl/index.php?controller=authentication&back=my-account");
        }

        @Test
        public void testLogowanie() {
            // logowanie na konto Jana Krzaka
            WebElement email = driver.findElement(By.name("email"));
            email.clear();
            email.sendKeys("maria_krzak@email.com");

            WebElement password = driver.findElement(By.name("password"));
            password.clear();
            password.sendKeys("Password123");

            //potwierdzenie danych logowania
            WebElement submit = driver.findElement(By.id("submit-login"));
            submit.click();

            // przeczekanie
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //wejdę w "Add New Address"
            WebElement addFirstAddress = driver.findElement(By.id("address-link"));
            addFirstAddress.click();

        }

        private void inputTextById(String id, String text) {
            WebElement element = driver.findElement(By.id(id));

            if (element.isEnabled()) {
                element.click();
                element.clear();
                element.sendKeys(text);

                // to mi znajdzie labelkę
                WebElement label = driver.findElement(By.xpath("//label[@for='" + id + "']"));
                System.out.println(label.getText() + ":" + text);
            }

        }

        @After
        public void tearDown() {
            // driver.quit();

        }
    }

