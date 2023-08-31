package elements;

import common.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class BaseElement {
    protected final WebElement element;
    protected final WebDriver driver = Driver.getInstance();

    protected BaseElement(By by) {
        this.element = driver.findElement(by);
    }

    protected BaseElement waitVisible() {

        return this;
    }

    protected void click() {
        this.element.click();
    }

    protected boolean isDisplayed() {
        return this.element.isDisplayed();
    }

    protected boolean isEnabled() {
        return this.element.isEnabled();
    }
}
