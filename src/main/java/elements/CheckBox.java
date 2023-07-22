package elements;

import org.openqa.selenium.By;

public class CheckBox extends BaseElement {
    public CheckBox(By by) {
        super(by);
    }

    @Override
    public CheckBox waitVisible() {
        super.waitVisible();
        return this;
    }

    @Override
    public CheckBox click() {
        super.click();
        return this;
    }

    public CheckBox select() {

        return this;
    }
}
