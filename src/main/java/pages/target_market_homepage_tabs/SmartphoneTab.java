package pages.target_market_homepage_tabs;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.TargetMarketHomePage;

import java.util.List;

public class SmartphoneTab extends TargetMarketHomePage {
    @FindBy(css = ".card-title")
    private List<WebElement> smartPhoneTitles;
    @FindBy(css = "strong.text-danger>i")
    private List<WebElement> smartPhonesPrices;
    @FindBy(css = ".btn-danger")
    private List<WebElement> addToCartButton;

    public void placeOrder(String phoneName) {
        List<String> titles = smartPhoneTitles.stream().map(WebElement::getText).toList();
        actions.moveToElement(addToCartButton.get(titles.indexOf(phoneName)));
        try {
            addToCartButton.get(titles.indexOf(phoneName)).click();
        } catch (Exception ex) {
            addToCartButton.get(titles.indexOf(phoneName)).click();
        }

    }

}