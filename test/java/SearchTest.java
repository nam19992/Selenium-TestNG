import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SearchTest extends BaseTest {


    @Test(dataProvider = "dataProvider")
    public void openChrome1(String text) throws InterruptedException {

        WebElement searchField = driver.findElement(By.name("q"));
        searchField.click();
        searchField.sendKeys(text);
        searchField.sendKeys(Keys.RETURN);
        Thread.sleep(3000);
        WebElement resultRow = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div[1]/div/div/span/a/h3"));
        assertThat(resultRow.isDisplayed()).as("Element has been displayed").isTrue();
        assertThat(resultRow.getText()).as("Wrong text has been displayed").isEqualTo("Как переехать в Германию и привыкнуть к новым ...");
        assertThat(resultRow.getAttribute("class")).as("Wrong attribute text").contains("LC20lb MBeuO DKV0Md");
    }
}

