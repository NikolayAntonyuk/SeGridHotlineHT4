package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Random;

public class SearchResultsPage extends BasePage {

    @FindBy(xpath = "//div[@class='list-item__value flex-column']//a[@class='btn btn--orange']")
    private List<WebElement> wishListIcons;

    @FindBy(xpath = "//div[@class='search__title']")
    private WebElement textSearchResult;


    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }


    public void clickWishListOnFirstProduct() {

        wishListIcons.get(0).click();
    }

    public boolean isTextSearchResultVisible() {
        return textSearchResult.isDisplayed();
    }

}
