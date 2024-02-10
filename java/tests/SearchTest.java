package tests;

import org.testng.annotations.Test;



public class SearchTest extends BaseTest {


    @Test(dataProvider = "dataProvider")
    public void openChrome1(String text) throws InterruptedException {

        steps.excuteSearchByKyeword(text)
                .verifyThatTopResultContainsCorrectText("Immigration to Germany")
                .verifyThatTopResultContaintsProperAttributeText("LC20lb MBeuO DKV0Md");
    }
}

