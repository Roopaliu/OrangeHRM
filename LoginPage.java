package Page;

import BasePck.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.FileNotFoundException;

public class LoginPage extends Base {
//Page Object Model-Page Factory-OR

        @FindBy(id = "txtUsername")
        WebElement Username;

        @FindBy(id = "txtPassword")
        WebElement Password;

        @FindBy(id = "btnLogin")
        WebElement LoginBtn;

        @FindBy(xpath = "//a[contains(text(), 'Forgot your password']")
        WebElement forgotPassword;

        @FindBy(xpath=" //img[contains(text(), 'logo']")
        WebElement hrmLogo;

        //Initialization the POM
        public LoginPage() throws FileNotFoundException {
            super();
            PageFactory.initElements(driver, this);

        }

        //Action on Login Page
    public String validateLoginPage(){
        return driver.getTitle();
    }

    public boolean validateOrangeHrmImg(){
         return hrmLogo.isDisplayed();
    }

    public dashBoard login(String Uname, String Pword){
        Username.sendKeys(Uname);
        Password.sendKeys(Pword);
        LoginBtn.click();

        return new dashBoard();
    }
    }

