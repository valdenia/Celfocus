package webServiceTesting;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateUserSteps {

  CreateUser createUser;
  String name, job;
  RequestSpecification request;

  @Given("^I access the \"([^\"]*)\"$")
  public void i_access_the(String api) throws Throwable {
    Response response = RestAssured.get(api);
    throw new PendingException();
  }

  @When("^Post a request with \"([^\"]*)\" and \"([^\"]*)\"$")
  public void post_a_request_with_and(String user, String job) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
  }
}


//  @Given("^I use user creation service$")
//  public void i_use_user_creation_service() throws Throwable {
//    RestAssured.baseURI  =  "https://reqres.in/api/users";
//    request  =  RestAssured.given();
//    request.header("Content-Type",  "application/json");
////    createUser = new CreateUser();
////    throw new PendingException();
//  }
//
//  @When("^I set name \"([^\"]*)\"$")
//  public void i_set_name(String arg1) throws Throwable {
//    createUser.setName(name);
//    this.name = name;
//    throw new PendingException();
//  }
//
//  @When("^\"([^\"]*)\"singer\"$")
//  public void singer(String job) throws Throwable {
//    createUser.setJob(job);
//    this.name = job;
//    throw new PendingException();
//  }
//
//  @Then("^I validate my response is correct$")
//  public void i_validate_my_response_is_correct() throws Throwable {
//    throw new PendingException();
//  }
//}
