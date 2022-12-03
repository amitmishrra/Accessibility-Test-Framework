package StepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static POM.AccesscibityTest.accesbility;
import static POM.AccesscibityTest.openHomePage;
import static drivers.Helper.quite;
import static drivers.Helper.setup;

public class AccessibiltySteps {
    @Given("SetUp Browser")
    public void set_Up() {
        setup();
    }


    @Given("Open Home page {string}")
    public void open_Home_Page(String Url) {
        openHomePage(Url);
    }


    @Then("Accesibility Test")
    public void accesibilityTest() {
        accesbility();
    }

    @Then("Tear Down the test")
    public void tearDown() {
        quite();
    }

}
