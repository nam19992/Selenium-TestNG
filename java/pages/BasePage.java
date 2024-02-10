package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.time.Duration;


import static tests.BaseTest.getDriver;

public abstract class BasePage {

    WebDriver driver;
    WebDriverWait wait;
    Actions builder;

    public BasePage() {
        this.driver = getDriver();
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        builder = new Actions(driver);
    }

    void pasteTextToElementFromClipboard(WebElement element, String text) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Clipboard clipboard = toolkit.getSystemClipboard();
        StringSelection stringSelection = new StringSelection(text);
        clipboard.setContents(stringSelection, null);
        element.sendKeys(Keys.CONTROL, "v");
    }

}
