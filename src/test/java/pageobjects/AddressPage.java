package pageobjects;


    import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

    public class AddressPage {
        private static WebDriver driver;

        @FindBy(name = "alias")
        WebElement aliasInput;

        @FindBy(name = "firstname")
        WebElement firstnameIput;

//        @FindBy(css = ".btn.btn-primary.form-control-submit")
//        WebElement submitButton;

        @FindBy(name = "lastname")
        WebElement lastnameInput;

        @FindBy(name = "company")
        WebElement companyInput;

        @FindBy(name = "VAT number")
        WebElement vat_numberInput;

        @FindBy(name = "address1")
        WebElement address1Input;

        @FindBy(name = "Address Complement")
        WebElement address2Input;


        public void UserInfoPage(WebDriver driver) {
            this.driver = driver;
            PageFactory.initElements(driver, this);
        }




    }

