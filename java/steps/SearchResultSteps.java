package steps;

import pages.SearchResultPage;

public class SearchResultSteps {

    private SearchResultPage searchResultPage = new SearchResultPage();

    public SearchResultSteps verifyThatTopResultContainsCorrectText(String text) {
        searchResultPage.asserThatTopResultContaintsCorrectText(text);
        return this;
    }

    public SearchResultSteps verifyThatTopResultContaintsProperAttributeText(String text) {
        searchResultPage.asserThatTopResultContaintsProperAttributeText(text);
        return this;
    }

}
