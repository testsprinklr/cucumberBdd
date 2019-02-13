package tests.steps;

import com.actions.HomePageActions;
import cucumber.api.java.en.And;
import tests.BaseUtil;

public class HomePageSteps {

    private BaseUtil baseUtil;
    private HomePageActions homePageActions;

    public HomePageSteps(BaseUtil baseUtil) {
        this.baseUtil = baseUtil;
        this.homePageActions = new HomePageActions(baseUtil.driver);
    }

    @And("^I search for a job with title \"([^\"]*)\" in location \"([^\"]*)\"$")
    public void iSearchForAJobTitle(String title, String location) throws Exception {
        homePageActions.searchForJob(title, location);
        homePageActions.clickOnSubmitButton();

    }

}
