package junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AsercjeOne {

        private WebDriver driver;

        @Before
        public void setUp() {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://prod-kurs.coderslab.pl/index.php?controller=identity");
        }

        @Test
        public void testFormularz(){
            // test z powtórzeniami

            WebElement firstname = driver.findElement(By.id("firstname"));
            firstname.clear();
            firstname.sendKeys("Janina");

            WebElement lastname = driver.findElement(By.id("lastname"));
            lastname.clear();
            lastname.sendKeys("Nowak");

            WebElement birthday = driver.findElement(By.id("birthday"));
            birthday.clear();
            birthday.sendKeys("10/04/1999");

        }

        private void inputTextById(String id, String text) {
            WebElement element = driver.findElement(By.id(id));

            if (element.isEnabled()) {
                element.click();
                element.clear();
                element.sendKeys(text);

                // to mi znajdzie labelkę
                WebElement label = driver.findElement(By.xpath("//label[@for='"+ id +"']"));
                System.out.println(label.getText() + ":" + text);
            }

        }

        @After
        public void tearDown(){
            // driver.quit();
        }
    }

