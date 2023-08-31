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

    public CheckBox select() {
        if (!super.element.isSelected()) {
            super.element.click();
        }
        return this;
    }

    public CheckBox unselect() {
        if (super.element.isSelected()) {
            super.element.click();
        }
        return this;
    }
}
