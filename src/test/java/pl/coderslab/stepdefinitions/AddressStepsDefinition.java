package pl.coderslab.stepdefinitions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddressStepsDefinition {

        private WebDriver driver;

        @Before
        public void setUp() {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://prod-kurs.coderslab.pl/index.php?controller=address");
        }

        @Test
        public void testKonto() {
            // test z powtórzeniami



            WebElement alias = driver.findElement(By.name("alias"));
            alias.clear();
            alias.sendKeys("222222");

            WebElement firstname = driver.findElement(By.name("firstname"));
            firstname.clear();
            firstname.sendKeys("Janina");

            WebElement lastname = driver.findElement(By.name("lastname"));
            lastname.clear();
            lastname.sendKeys("Nowak");

            WebElement company = driver.findElement(By.name("company"));
            company.clear();
            company.sendKeys("RRRRR");

            WebElement vatNumber = driver.findElement(By.name("vat_number"));
            vatNumber.clear();
            vatNumber.sendKeys("55555555");

            WebElement address1 = driver.findElement(By.name("address1"));
            address1.clear();
            address1.sendKeys("Long Street");

            WebElement address2 = driver.findElement(By.name("address2"));
            address2.clear();
            address2.sendKeys("Short Street");

            WebElement city = driver.findElement(By.name("city"));
            city.clear();
            city.sendKeys("Las Vegas");

            WebElement postcode = driver.findElement(By.name("postcode"));
            postcode.clear();
            postcode.sendKeys("14");

            WebElement phone = driver.findElement(By.name("phone"));
            phone.clear();
            phone.sendKeys("1234567");

            WebElement submit = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/form/footer/button"));
            submit.click();

        }
    private void inputTextById(String id, String text) {
        WebElement element = driver.findElement(By.id(id));

        if (element.isEnabled()) {
            element.click();
            element.clear();
            element.sendKeys(text);
        }

    }

    @After
    public void tearDown(){
        // driver.quit();
    }
}





