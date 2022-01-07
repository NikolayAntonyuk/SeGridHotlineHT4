package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage {

    @FindBy(xpath = "//div[@class='bookmark-button flex']")
    private WebElement addToFavorites;

    @FindBy(xpath = "//button[@class='footer__btn btn btn--graphite']")
    private WebElement buttonSaveToFavorites;

    @FindBy(xpath = "//button[@class='footer__btn btn btn--transparent']")
    private WebElement buttonContinue;

    @FindBy(xpath = "//a[@class='footer__btn btn btn--graphite']")
    private WebElement buttonGoToFavorites;

    @FindBy(xpath = "//a[@class='listings-popover__item-link flex-inline' and contains(text(),'Закладки:')]")
    private WebElement buttonFavorites;




    public ProductPage(WebDriver driver) {
        super(driver);
    }



    public WebElement getAddToFavoritesButton() {
        return addToFavorites;
    }

    public boolean isButtonSaveToFavoritesVisible() {
        return buttonSaveToFavorites.isDisplayed();
    }

    public void isButtonContinueVisible() {
        buttonContinue.isDisplayed();
    }

    public String getButtonFavoritesHeaderText() {
        return buttonFavorites.getText();
    }

    public void isButtonGoToFavoritesVisible() {
        buttonGoToFavorites.isDisplayed();
    }

    public void clickButtonGoToFavorites() {
        buttonGoToFavorites.click();
    }

    public void clickAddToFavorites() {
        addToFavorites.click();
    }

    public void clickButtonSaveToFavorites() {
        buttonSaveToFavorites.click();
    }

    public void clickButtonContinue() {
        buttonContinue.click();
    }

    public void clickbuttonGoToFavorites() {
        buttonGoToFavorites.click();
    }

}
