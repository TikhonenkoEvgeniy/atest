package elements;

import common.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public abstract class BaseElement {
    protected final By by;
    protected final WebDriver driver = Driver.getInstance();

    protected BaseElement(By by) {
        this.by = by;
    }

    protected BaseElement waitVisible() {

        return this;
    }

    protected boolean isDisplayed() {
        return driver.findElement(by).isDisplayed();
    }

    protected boolean isEnabled() {
        return driver.findElement(by).isEnabled();
    }

    protected BaseElement click() {
        driver.findElement(by).click();
        return this;
    }
}
