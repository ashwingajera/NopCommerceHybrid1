
Feature: To Verify, user should able to buy a product successfully

  @registerUserBuyAProduct
  Scenario: Register user should able to buy a product successfully and able to see success message
    Given Register user on register homepage
    When Register user click on Book category page
    And register user add selected product to cart to checkout
    And  register user enter all  detail for billing and shipping and shipping method
    And register user choose option for  payment method
    And register user enter all detail for payment information
    Then register user able to buy a product successfully and able to see success message

  @guestUserBuyAProduct
  Scenario: Guest user should able to buy a product successfully and able to see success message
    Given Guest  user on  homepage
    When guest user click on Book category page
    And guest user add selected product to cart to checkout
    And guest enter all  detail for billing and shipping and shipping method
    And guest choose option for  payment method
    And guest user enter all detail for payment information
    Then guest user able to buy a product successfully and able to see success message


