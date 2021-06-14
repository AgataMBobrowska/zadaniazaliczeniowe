package zadaniazaliczeniowe;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class zadaniedrugieTest {

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

            // logowanie
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

            //wybór "Clothes"
            WebElement chooseCategory = driver.findElement(By.id("category-3"));
            chooseCategory.click();

            // rozmiary
            WebElement label = driver.findElement(By.xpath("//*[@id=\"js-product-list\"]/div[1]/article[2]/div/a"));
            label.click();

            // rozmiar M
            WebElement chooseSize = driver.findElement(By.xpath("//*[@id=\"group_1\"]/option[2]"));
            chooseSize.click();

            // przeczekanie
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // ilość
            WebElement chooseQuantity = driver.findElement(By.id("quantity_wanted"));
            chooseQuantity.clear();
            chooseQuantity.sendKeys("5");

            // przeczekanie
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //dodawanie do koszyka
            WebElement addToCart = driver.findElement(By.xpath("//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[2]/button"));
            addToCart.click();

            // przeczekanie
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //opcja checkout
            WebElement checkOut = driver.findElement(By.cssSelector("#blockcart-modal > div > div > div.modal-body > div > div.col-md-7 > div > div > a"));
            checkOut.click();

            // proceed to checkout
            WebElement proceedCheckout = driver.findElement(By.cssSelector("#main > div > div.cart-grid-right.col-xs-12.col-lg-4 > div.card.cart-summary > div.checkout.cart-detailed-actions.card-block > div > a"));
            proceedCheckout.click();

            // przeczekanie
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // wybór"Continue"
            WebElement submitAddress = driver.findElement(By.cssSelector("#checkout-addresses-step > div > div > form > div.clearfix > button"));
            submitAddress.click();

            // przeczekanie
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // metoda dostawy
            WebElement submitShippingMethod = driver.findElement(By.cssSelector("#js-delivery > div > div.delivery-options > div:nth-child(1) > div"));
            submitShippingMethod.click();

            // potwierdzenie metody dostawy
            WebElement submitPickUp = driver.findElement(By.cssSelector("#js-delivery > button"));
            submitPickUp.click();

            // wybór sposobu płatności (czek)
            WebElement submitPaymentMethod = driver.findElement(By.cssSelector("#payment-option-1"));
            submitPaymentMethod.click();

            // potwierdzenie regulaminu
            WebElement submitTerms = driver.findElement(By.cssSelector("#conditions_to_approve\\[terms-and-conditions\\]"));
            submitTerms.click();

            // potwierdzenie sposobu płatności
            WebElement submitPayment = driver.findElement(By.cssSelector("#payment-confirmation > div.ps-shown-by-js > button"));
            submitPayment.click();

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