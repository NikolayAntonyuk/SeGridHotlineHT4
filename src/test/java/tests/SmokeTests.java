package tests;

import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class SmokeTests extends BaseTest {

    private static final long DEFAULT_WAITING_TIME = 90;

    @Test
    public void checkMainComponentsOnHomePage() {

        assertTrue(getHomePage().isDoSearchVisible());
        assertTrue(getHomePage().isAllCatalogsVisible());
        assertTrue(getHomePage().isIconCatalogVisible());
        getHomePage().waitForPageLoadComplete(5000);
        assertTrue(getHomePage().isIconFavoritesVisible());
        assertTrue(getHomePage().isItemLoginButtonVisible());
        assertTrue(getHomePage().isSearchBoxVisible());
        assertTrue(getHomePage().getLanguageButtonTextRU().equalsIgnoreCase("рус"));
        getHomePage().clickLanguageButtonUK();
        assertTrue(getHomePage().getLanguageButtonTextUK().equalsIgnoreCase("укр"));
        getHomePage().clickLanguageButtonRU();
        getHomePage().clickItemLoginButton();
        getProductPage().waitForPageLoadComplete(30);
        assertTrue(getDriver().getCurrentUrl().contains("login"));
    }

    @Test
    public void checkSearchWishList() {
        getHomePage().waitForAjaxToComplete(DEFAULT_WAITING_TIME);
        getHomePage().isSearchBoxVisible();
        getHomePage().implicitWait(3000);
        getHomePage().enterTextToSearchField("Samsung");
        getHomePage().clickDoSearchButton();
        getHomePage().waitForPageLoadComplete(DEFAULT_WAITING_TIME);
        assertTrue(getSearchResultsPage().isTextSearchResultVisible());

    }

    @Test
    public void checkProductPage() {
        getHomePage().isSearchBoxVisible();
        getHomePage().implicitWait(3000);
        getHomePage().enterTextToSearchField("ASUS");
        getHomePage().implicitWait(5000);
        getSearchResultsPage().clickWishListOnFirstProduct();
        getProductPage().waitForPageLoadComplete(5000);
        assertTrue(getProductPage().isButtonAboutProductVisible());
        getProductPage().clickButtonAboutProduct();
        assertTrue(getProductPage().isTextSpecificationsVisible());
    }

    @Test
    public void checkAddToCFavorites() {
        getHomePage().isSearchBoxVisible();
        getHomePage().implicitWait(3000);
        getHomePage().enterTextToSearchField("Xiaomi");
        getHomePage().implicitWait(5000);
        getSearchResultsPage().clickWishListOnFirstProduct();
        getProductPage().waitForPageLoadComplete(5000);
        assertTrue(getProductPage().isButtonAboutProductVisible());
        getProductPage().clickAddToFavorites();
        assertTrue(getProductPage().isButtonSaveToFavoritesVisible());
        assertTrue(getProductPage().isButtonContinueVisible());
        getHomePage().waitForPageLoadComplete(5000);
        assertTrue(getProductPage().isButtonSaveToFavoritesVisible());
        getHomePage().waitForPageLoadComplete(DEFAULT_WAITING_TIME);
        getProductPage().clickButtonSaveToFavorites();
        getProductPage().waitForPageLoadComplete(5000);
        assertTrue(getProductPage().isButtonContinueVisible());
        assertTrue(getProductPage().isButtonGoToFavoritesVisible());
        getProductPage().clickButtonGoToFavorites();
        getHomePage().waitForPageLoadComplete(DEFAULT_WAITING_TIME);
        getHomePage().waitForAjaxToComplete(DEFAULT_WAITING_TIME);
        assertEquals(getBookmarksPage().getCountBookmarks(), "1");





    }

}
