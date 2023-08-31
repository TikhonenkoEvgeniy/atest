package elements;

import org.openqa.selenium.By;

public class TextField extends BaseElement {
    public TextField(By by) {
        super(by);
    }

    @Override
    public TextField waitVisible() {
        super.waitVisible();
        return this;
    }

    public void insertText(String text) {
        super.element.sendKeys(text);
    }

    public String getText() {
        return super.element.getText();
    }
}
