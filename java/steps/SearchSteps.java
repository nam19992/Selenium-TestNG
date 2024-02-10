package steps;

import pages.SearchPage;


public class SearchSteps {

    private SearchPage searchPage = new SearchPage();

    public SearchResultSteps excuteSearchByKyeword(String keyword) throws InterruptedException {
        searchPage.fillSearchField(keyword);
        searchPage.pressEnter();
        return new SearchResultSteps();
    }

}
