package StepDefinition;

import ScreenRetails.TC001;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;


public class TC001Steps {

    WebDriver driver;
    TC001 test = new TC001();

    @Given("^I open Chrome and launch the application$")
    public void i_open_Chrome_and_launch_the_application() throws Throwable {
        test = new TC001();
        test.openSite();
    }

    @When("^Select type \"([^\"]*)\"$")
    public void Select_type(String type) throws Throwable {
        test = new TC001();
        test.selectType(type);
    }

    @When("^Select support plan \"([^\"]*)\"$")
    public void Select_support_plan(String plan) {
        test = new TC001();
        test.Select_support_plan(plan);
    }

    @When("^Write monthly duration of (\\d+)$")
    public void Write_monthly_duration_of (String number) {
        test = new TC001();
        test.Write_monthly_duration_of(number);
    }

    @When("^Click in calculate price button$")
    public void click_in_calculate_price_button() {
        test = new TC001();
        test.click_in_calculate_price_button();
    }

    @Then("^I see the correct price \"([^\"]*)\"$")
    public void	i_see_the_correct_price(String price) throws InterruptedException {
        test = new TC001();
        test.i_see_the_correct_price(price);
    }
}
