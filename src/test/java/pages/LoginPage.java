package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

public class LoginPage {

    @FindBy(xpath = "//input[@id='email']")
    private WebElement emailAddress;

    @FindBy(xpath = "//input[@id='passwd']" )
    private WebElement password;

    @FindBy(xpath = "//button[@id='SubmitLogin']")
    private WebElement signInButton;

    @FindBy(xpath = "//div[@class='alert alert-danger']//p")
    private WebElement errorMessage1;

    @FindBy(xpath = "//div[@class='alert alert-danger']//li")
    private WebElement errorMessage2;

    @FindBy(xpath = "//input[@id='email_create']")
    private WebElement emailField;

    @FindBy(xpath = "//button[@id='SubmitCreate']")
    private WebElement createAnAccountButton;

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    public WebElement getEmailAddress() {return emailAddress;}

    public WebElement getPassword() {return password;}

    public WebElement getSignInButton() {return signInButton;}

    public WebElement getErrorMessage1() {return errorMessage1;}

    public WebElement getErrorMessage2() {return errorMessage2;}

    public WebElement getEmailField() { return emailField; }

    public WebElement getCreateAnAccountButton() { return createAnAccountButton;}

    public void login(String emailInput, String passwordInput) {
        emailAddress.sendKeys(emailInput);
        password.sendKeys(passwordInput);
        signInButton.click();
    }

    public void enterEmail(String email){
        WebDriverWait wait= new WebDriverWait(Driver.getDriver(), 5);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='email_create']")));
        emailField.sendKeys(email); //johndoe22@gmail.com
    }

    public void clickCreateAnAccountButton(){
        createAnAccountButton.click();
    }

}
