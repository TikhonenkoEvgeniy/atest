package pages;

import enums.UrlPages;

public class HomePage extends BasePage {

    public HomePage open() {
        super.open(UrlPages.HOME);
        return this;
    }

}
