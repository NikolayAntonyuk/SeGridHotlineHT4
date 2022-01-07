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

    @FindBy(xpath = "//div[@class='header-tools cell-7']//span[@data-language='ru']")
    private WebElement languageButtonRU;

    @FindBy(xpath = "//div[@class='header-tools cell-7']//span[@data-language='uk']")
    private WebElement languageButtonUK;

    @FindBy(xpath = "//div[@class='header-tools cell-7']//span[@data-language='uk']")
    private WebElement popUp;

    @FindBy(xpath = "//span[@class='uppercase']")
    private WebElement iconCatalog;

    @FindBy(xpath = "//li[@class='menu-main-item catalog']")
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

    public String getLanguageButtonTextRU() {
        return languageButtonRU.getText();
    }

    public String getLanguageButtonTextUK() {
        return languageButtonUK.getText();
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

    public void clickLanguageButtonRU() {
        languageButtonRU.click();
    }

    public void clickLanguageButtonUK() {
        languageButtonUK.click();
    }

    public void enterTextToSearchField(final String searchText) {
        searchPlaceholder.clear();
        searchBox.sendKeys(searchText);
    }


}
