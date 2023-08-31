package pages;

import elements.Button;
import elements.LabelText;
import elements.TextArea;
import elements.TextField;
import enums.UrlPages;
import org.openqa.selenium.By;

public class ElementsPage extends BasePage {
    Button btnTextBox = new Button(By.xpath("//span[contains(text(),'Text Box')]"));
    Button btnCheckBox = new Button(By.xpath("//span[contains(text(),'Check Box')]"));
    Button btnRadioButton = new Button(By.xpath("//span[contains(text(),'Radio Button')]"));
    Button btnWebTables = new Button(By.xpath("//span[contains(text(),'Web Tables')]"));
    Button btnButtons = new Button(By.xpath("//span[contains(text(),'Buttons')]"));
    Button btnLinks = new Button(By.xpath("//span[contains(text(),'Links')]"));
    Button btnBrokenLinksImages = new Button(By.xpath("//span[contains(text(),'Broken Links - Images')]"));
    Button btnUploadAndDownload = new Button(By.xpath("//span[contains(text(),'Upload and Download')]"));
    Button btnDynamicProperties = new Button(By.xpath("//span[contains(text(),'DynamicProperties')]"));
    Button btnSubmit = new Button(By.id("submit"));
    TextField fldUserName = new TextField(By.id("userName"));
    TextField fldEmail = new TextField(By.id("userEmail"));
    TextArea txtCurrentAddress = new TextArea(By.id("currentAddress"));
    TextArea txtPermanentAddress = new TextArea(By.id("permanentAddress"));
    LabelText lblName = new LabelText(By.cssSelector("#output #name"));
    LabelText lblEmail = new LabelText(By.cssSelector("#output #email"));
    LabelText lblCurrentAddress = new LabelText(By.cssSelector("#output #currentAddress"));
    LabelText lblPermanentAddress = new LabelText(By.cssSelector("#output #permanentAddress"));

    public ElementsPage open() {
        super.open(UrlPages.ELEMENTS);
        return this;
    }
}
