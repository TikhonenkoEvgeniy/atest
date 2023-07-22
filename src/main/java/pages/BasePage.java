package pages;

import common.Driver;
import enums.UrlPages;
import org.openqa.selenium.WebDriver;

public abstract class BasePage {
    private final WebDriver driver = Driver.getInstance();

    protected void open(UrlPages url) {
        driver.get(url.getUrl());
    }

}
