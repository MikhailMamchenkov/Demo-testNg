package pages.listing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.base.BasePage;

public class RealtListingPage extends BasePage {

    public RealtListingPage(WebDriver driver) {
        super(driver);
    }

    private final By cart = By.xpath("//span[@class='flex-grow-1 justify-content-md-end']");

    public RealtListingPage checkCountCards() {
        int countCard = driver.findElements(cart).size();
        Assert.assertEquals(countCard, 20);
        return this;
    }
}
