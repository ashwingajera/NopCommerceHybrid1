package NopCommerceCucumber;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MystepDef {

    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationResultPage registrationResultPage = new RegistrationResultPage();
    RegisteredHomePage registeredHomePage = new RegisteredHomePage();
    RegisterUserReferAProductToFriendByEmailPage referAProductToFriendByEmailPage = new RegisterUserReferAProductToFriendByEmailPage();
    RegisterUserReferAProductToFriendByEmailResultPage referAProductToFriendByEmailResultPage = new RegisterUserReferAProductToFriendByEmailResultPage();
    UnRegisterUserReferAProductToFriendByEmailPage unregisterUserReferAProductToFriendByEmailPage = new UnRegisterUserReferAProductToFriendByEmailPage();
    UnRegisterUserReferAProductToFriendByEmailResultPage unRegisterUserReferAProductToFriendByEmailResultPage = new UnRegisterUserReferAProductToFriendByEmailResultPage();
    BookCategoryShoppingCartPage bookCategoryShoppingCartPage = new BookCategoryShoppingCartPage();
    CheckOutPage checkOutPage = new CheckOutPage();
    OrderPlaceCheckResultPage orderPlaceCheckResultPage = new OrderPlaceCheckResultPage();

    @Given("^User is  on register page$")
    public void user_is_on_register_page()  {
        homePage.clickOnRegisterButtonOnHomePage();
    }

    @When("^User enter all details for registration$")
    public void user_enter_all_details_for_registration()  {
        registrationPage.userEnterRegistrationDetails();

    }

    @Then("^User should able to register successfully$")
    public void user_should_able_to_register_successfully() {
        registrationResultPage.verifyUserSeeRegistrationSuccessMassage();
    }
    @Given("^User is on registered homepage$")
    public void user_is_on_registered_homepage()  {
        homePage.clickOnRegisterButtonOnHomePage();
        registrationPage.userEnterRegistrationDetails();
        registrationResultPage.verifyUserSeeRegistrationSuccessMassage();

    }


    @When("^User Click on EmailAFriendButton$")
    public void user_Click_on_EmailAFriendButton()  {
        referAProductToFriendByEmailPage.clickOnEmailAFriendButtonElement();

    }

    @Given("^User is on homepage$")
    public void userIsOnHomepage() {
        homePage.clickOnProductForReferToFriend();
    }


    @Then("^Register user able to refer a product to friend successfully and  see success message on screen$")
    public void registerUserAbleToReferAProductToFriendSuccessfullyAndSeeSuccessMessageOnScreen() {
        referAProductToFriendByEmailResultPage.verifyRegisterUserSeeReferAProductSuccessMassage();

    }



    @And("^Register enter all details for refer a product to friend by email and click on send message$")
    public void registerEnterAllDetailsForReferAProductToFriendByEmailAndClickOnSendMessage() {
        referAProductToFriendByEmailPage.registerUserEnterDetailsForReferAProductToFriendByEmail();

    }

    @When("^Register user click on a product$")
    public void registerUserClickOnAProduct() {
        registeredHomePage.clickOnProductForReferToFriend();
    }


    @Given("^Guest user is on homepage$")
    public void guestUserIsOnHomepage() {

    }

    @When("^Guest user click on a product$")
    public void guestUserClickOnAProduct() {
        homePage.clickOnProductForReferToFriend();

    }

    @And("^Guest  user click on EmailAFriendButton$")
    public void guestUserClickOnEmailAFriendButton() {
        unregisterUserReferAProductToFriendByEmailPage.clickOnEmailAFriendButtonElement();

    }

    @And("^Guest user enter all details for refer a product to friend by email and click on send message$")
    public void guestUserEnterAllDetailsForReferAProductToFriendByEmailAndClickOnSendMessage() {
        unregisterUserReferAProductToFriendByEmailPage.unregisterUserEnterDetailsForReferAProductToFriendByEmail();


    }

    @Then("^Guest user unable to refer a product to friend by email and see message display that only register user refer a product$")
    public void guestUserUnableToReferAProductToFriendByEmailAndSeeMessageDisplayThatOnlyRegisterUserReferAProduct() {
        unRegisterUserReferAProductToFriendByEmailResultPage.verifyUnRegisterUserSeeReferAProductErrorMassage();
    }

    @Given("^Register user on register homepage$")
    public void register_user_on_register_homepage()  {
        homePage.clickOnRegisterButtonOnHomePage();
        registrationPage.userEnterRegistrationDetails();
        registrationResultPage.verifyUserSeeRegistrationSuccessMassage();


    }

    @When("^Register user click on Book category page$")
    public void register_user_click_on_Book_category_page()  {
        registeredHomePage.clickOnBookCategoryButtonOnHomepage();


    }

    @When("^register user add selected product to cart to checkout$")
    public void register_user_add_selected_product_to_cart_to_checkout() throws InterruptedException  {
        bookCategoryShoppingCartPage.addSelectedProductToCart();


    }

    @When("^register user enter all  detail for billing and shipping and shipping method$")
    public void register_user_enter_all_detail_for_billing_and_shipping_and_shipping_method() throws InterruptedException  {
        checkOutPage.shoppingCheckout();

    }

    @When("^register user choose option for  payment method$")
    public void register_user_choose_option_for_payment_method() throws InterruptedException  {
        checkOutPage.selectionForPaymentMethod();

    }

    @When("^register user enter all detail for payment information$")
    public void register_user_enter_all_detail_for_payment_information() throws InterruptedException  {
        checkOutPage.paymentDetailEnter();

    }

    @Then("^register user able to buy a product successfully and able to see success message$")
    public void register_user_able_to_buy_a_product_successfully_and_able_to_see_success_message() throws InterruptedException {
        orderPlaceCheckResultPage.orderPlaceCheck();
        checkOutPage.continueToHomePage();
    }

    @Given("^Guest  user on  homepage$")
    public void guest_user_on_homepage()  {

    }

    @When("^guest user click on Book category page$")
    public void guest_user_click_on_Book_category_page()  {
        homePage.clickOnBookCategoryButtonOnHomepage();


    }

    @When("^guest user add selected product to cart to checkout$")
    public void guest_user_add_selected_product_to_cart_to_checkout()  throws InterruptedException {
        bookCategoryShoppingCartPage.addSelectedProductToCart();

    }

    @When("^guest enter all  detail for billing and shipping and shipping method$")
    public void guest_enter_all_detail_for_billing_and_shipping_and_shipping_method()  {
        checkOutPage.guestCheckOut();

    }

    @When("^guest choose option for  payment method$")
    public void guest_choose_option_for_payment_method() throws InterruptedException  {
        checkOutPage.selectionForPaymentMethod();

    }

    @When("^guest user enter all detail for payment information$")
    public void guest_user_enter_all_detail_for_payment_information() throws InterruptedException  {
        checkOutPage.paymentDetailEnter();

    }

    @Then("^guest user able to buy a product successfully and able to see success message$")
    public void guest_user_able_to_buy_a_product_successfully_and_able_to_see_success_message() throws InterruptedException  {
        orderPlaceCheckResultPage.orderPlaceCheck();
        checkOutPage.continueToHomePage();

    }
}
