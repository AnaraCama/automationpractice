package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MainPage {

    public MainPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class='login']")
    private WebElement mainPageSignInButton;

    public WebElement getMainPageSignInButton() {return mainPageSignInButton;}

    public void signInFromMainPage() {
        mainPageSignInButton.click();
    }
}


