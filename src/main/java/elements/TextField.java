package elements;

import org.openqa.selenium.By;

public class TextField extends BaseElement {
    public TextField(By by) {
        super(by);
    }

    public TextField inputText(String text) {
        super.driver.findElement(super.by).sendKeys(text);
        return this;
    }

    @Override
    public TextField waitVisible() {
        super.waitVisible();
        return this;
    }

    @Override
    public TextField click() {
        super.click();
        return this;
    }
}
