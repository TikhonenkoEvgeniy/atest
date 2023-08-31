package pages;

import elements.Button;
import enums.UrlPages;
import org.openqa.selenium.By;

public class MainPage extends BasePage {
    Button btnElements = new Button(By.xpath("//*[@class=\"category-cards\"]/div[1]"));
    Button btnForms = new Button(By.xpath("//*[@class=\"category-cards\"]/div[2]"));
    Button btnAlertFrameWindow = new Button(By.xpath("//*[@class=\"category-cards\"]/div[3]"));
    Button btnWidgets = new Button(By.xpath("//*[@class=\"category-cards\"]/div[4]"));
    Button btnInteractions = new Button(By.xpath("//*[@class=\"category-cards\"]/div[5]"));
    Button btnBookStoreApp = new Button(By.xpath("//*[@class=\"category-cards\"]/div[6]"));

    public MainPage open() {
        super.open(UrlPages.HOME);
        return this;
    }

    public ElementsPage clickBtnElements() {
        btnElements.click();
        return new ElementsPage();
    }

    public FormsPage clickBtnForms() {
        btnForms.click();
        return new FormsPage();
    }

    public AlertFrameWindowPage clickBtnAlertFrameWindow() {
        btnAlertFrameWindow.click();
        return new AlertFrameWindowPage();
    }

    public WidgetsPage clickBtnWidgets() {
        btnWidgets.click();
        return new WidgetsPage();
    }

    public InteractionsPage clickBtnInteractions() {
        btnInteractions.click();
        return new InteractionsPage();
    }

    public BookStoreAppPage clickBtnBookStoreApp() {
        btnBookStoreApp.click();
        return new BookStoreAppPage();
    }
}
