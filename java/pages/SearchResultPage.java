package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SearchResultPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"rso\"]/div[3]/div/div/div[1]/div/div/span/a/h3")

    private WebElement resultRow;

    @FindBy(xpath = "//*[@id=\"rso\"]/div[3]/div/div/div[1]/div/div/span/a/h3")

    private List<WebElement> resultRows;

    public SearchResultPage() {
        super();
    }

    public void asserThatTopResultContaintsCorrectText(String expected) {
        wait.until(ExpectedConditions.visibilityOfAllElements(resultRows));
        assertThat(resultRows.stream().map(e->e.getText()).collect(Collectors.toList()).toString())
                .as("Wrong text has been displayed").contains(expected);

    }

    public void asserThatTopResultContaintsProperAttributeText(String expected) {
        assertThat(resultRow.getAttribute("class")).as("Wrong attribute text").contains(expected);
    }

}

