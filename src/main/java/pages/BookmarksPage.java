package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookmarksPage extends BasePage{
    public BookmarksPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//div[@class='cell-9 cell-md']/h1/span")
    private WebElement countBookmarks;


    public String getCountBookmarks() {
        return countBookmarks.getText();
    }

}
