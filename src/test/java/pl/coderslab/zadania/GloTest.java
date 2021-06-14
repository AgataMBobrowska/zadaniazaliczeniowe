package pl.coderslab.zadania;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GloTest {

        private WebDriver driver;

        @Before
        public void setUp() {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://qloapps.coderslab.pl/pl/logowanie?back=my-account");
        }

        @Test
        public void testKonto() {
            // test z powtórzeniami


            WebElement email = driver.findElement(By.id("email_create"));
            email.clear();
            email.sendKeys("Marcin@gawel.pl");

            WebElement submit = driver.findElement(By.id("SubmitCreate"));
            submit.click();

           try {
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
                WebElement firstname = driver.findElement(By.id("customer_firstname"));
                firstname.clear();
                firstname.sendKeys("Anna");

                WebElement lastname = driver.findElement(By.id("customer_lastname"));
                lastname.clear();
                lastname.sendKeys("Mak");

                WebElement password = driver.findElement(By.id("passwd"));
                password.clear();
                password.sendKeys("Password1234");


        }


        private void inputTextById(String id, String text) {
            WebElement element = driver.findElement(By.id(id));

            if (element.isEnabled()) {
                element.click();
                element.clear();
                element.sendKeys(text);

                // to mi znajdzie label
//                WebElement label = driver.findElement(By.xpath("//label[@for='"+ id +"']"));
//                System.out.println(label.getText() + ":" + text);
            }

        }

        @After
        public void tearDown(){
            // driver.quit();
        }
    }

