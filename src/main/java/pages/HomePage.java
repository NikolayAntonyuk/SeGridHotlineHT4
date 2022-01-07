package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//input[@id='searchbox']")
    private WebElement searchBox;

    @FindBy(xpath = "//input[@id='doSearch']")
    private WebElement doSearch;



    @FindBy(xpath = "//div[@class='item-wishlist']//span[@class='name']")
    private WebElement iconFavorites;

    @FindBy(xpath = "//div[@class='header-tools cell-7']//span[@class='js-change-language']")
    private WebElement languageButton;

    @FindBy(xpath = "//span[@class='uppercase']")
    private WebElement iconCatalog;

    @FindBy(xpath = "//li[@class='menu-main-item catalog active']//a[@class='menu-main-link']")
    private WebElement allCatalogs;

    @FindBy(xpath = "//div[@class='item-login']//span[@class='name']")
    private WebElement itemLogin;

    @FindBy(xpath = "//input[@placeholder='... знайти товар']")
    private WebElement searchPlaceholder;






    public HomePage(WebDriver driver) {
        super(driver);
    }


    public boolean isSearchBoxVisible() {
        return searchBox.isDisplayed();
    }

    public boolean isDoSearchVisible() {
        return doSearch.isDisplayed();
    }

    public boolean isIconFavoritesVisible() {
        return iconFavorites.isDisplayed();
    }

    public String getLanguageButtonText() {
        return languageButton.getText();
    }

    public boolean isIconCatalogVisible() {
        return iconCatalog.isDisplayed();
    }

    public boolean isAllCatalogsVisible() {
        return allCatalogs.isDisplayed();
    }

    public void clickItemLoginButton() {
        itemLogin.click();
    }

    public boolean isItemLoginButtonVisible() {
        return itemLogin.isDisplayed();
    }

    public void clickDoSearchButton() {
        doSearch.click();
    }

    public void clickAllCatalogsButton() {
        allCatalogs.click();
    }

    public void clickLanguageButton() {
        languageButton.click();
    }

    public void enterTextToSearchField(final String searchText) {
        searchPlaceholder.clear();
        searchPlaceholder.sendKeys(searchText, Keys.ENTER);
    }


}
