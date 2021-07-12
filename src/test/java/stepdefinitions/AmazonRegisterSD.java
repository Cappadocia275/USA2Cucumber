package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.AmazonPage;
import utilities.Driver;

public class AmazonRegisterSD {

    AmazonPage amazonPage = new AmazonPage();
    Actions actions = new Actions(Driver.getDriver());

    @Given("Go to Amazon webpage")
    public void go_to_amazon_webpage() {
        Driver.getDriver().get("https://amazon.com");

    }
    @Given("Find the sign in icon")
    public void find_the_sign_in_icon() {
        actions.moveToElement(amazonPage.signIn).perform();

    }
    @Given("Click the Start here button")
    public void click_the_start_here_button() {
        amazonPage.startHere.click();

    }
    @Given("Fill out the necessary part")
    public void fill_out_the_necessary_part() {
        amazonPage.Name.sendKeys("Dolphin Silver");
        amazonPage.mail.sendKeys("dolphinsilver@gmail.com");
        amazonPage.password.sendKeys("123456");
        amazonPage.rePassword.sendKeys("123456");

    }
    @Then("Click the create amazon account button")
    public void click_the_create_amazon_account_button () {

        amazonPage.CreatAccountButton.click();
        String puzzle=amazonPage.confirmation.getText();

        Assert.assertEquals(puzzle,"Solve this puzzle to protect your account");


        }
    }

