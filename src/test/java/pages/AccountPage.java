package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.Map;

public class AccountPage {

    @FindBy(id = "customer_firstname")
    private WebElement firstName;

    @FindBy(id = "customer_lastname")
    private WebElement lastName;

    @FindBy(id = "email")
    private WebElement email;

    @FindBy(id = "passwd")
    private WebElement password;

    @FindBy(id = "address1")
    private WebElement address;

    @FindBy(id = "city")
    private WebElement city;

    @FindBy(id = "id_state")
    private WebElement state;

    @FindBy(id = "postcode")
    private WebElement postalCode;

    @FindBy(id = "phone_mobile")
    private WebElement mobilePhone;

    @FindBy(id="submitAccount")
    private WebElement registerButton;

    public WebElement getFirstName() {
        return firstName;
    }

    public WebElement getLastName() {
        return lastName;
    }

    public WebElement getEmail() {
        return email;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getAddress() {
        return address;
    }

    public WebElement getCity() {
        return city;
    }

    public WebElement getState() {
        return state;
    }

    public WebElement getPostalCode() {
        return postalCode;
    }

    public WebElement getMobilePhone() {
        return mobilePhone;
    }

    public WebElement getRegisterButton() {
        return registerButton;
    }

    public void insertUserDetails(Map<String, String> data){
        firstName.sendKeys(data.get("FirstName"));
        lastName.sendKeys(data.get("LastName"));
        email.sendKeys(data.get("Email"));
        password.sendKeys(data.get("Password"));
        address.sendKeys(data.get("Address"));
        city.sendKeys(data.get("City"));
        Select stateSelect = new Select(state);
        stateSelect.selectByVisibleText(data.get("State"));
        postalCode.sendKeys(data.get("PostalCode"));
        mobilePhone.sendKeys(data.get("MobilePhone"));
    }

    public void clickRegisterButton(){
        registerButton.click();
    }

}


