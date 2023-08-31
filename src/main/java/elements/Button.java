package elements;

import org.openqa.selenium.By;

public class Button extends BaseElement {

    public Button(By by) {
        super(by);
    }


    @Override
    public Button waitVisible() {
        super.waitVisible();
        return this;
    }

    @Override
    protected boolean isDisplayed() {
        return super.isDisplayed();
    }

    @Override
    protected boolean isEnabled() {
        return super.isEnabled();
    }

    @Override
    public void click() {
        super.click();
    }
}
