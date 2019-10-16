

Feature:  To Verify,User should able to refer a product to friend by email successfully


  @registerUserReferAProduct
  Scenario: Register user should able to refer a product to friend by email successfully
    Given User is on registered homepage
    When Register user click on a product
    And User Click on EmailAFriendButton
    And Register enter all details for refer a product to friend by email and click on send message
    Then  Register user able to refer a product to friend successfully and  see success message on screen


  @guestUserReferAProduct
  Scenario:Guest user should not able to refer a product to friend by email and see message display that  only register user refer a product to friend
    Given Guest user is on homepage
     When Guest user click on a product
     And Guest  user click on EmailAFriendButton
     And Guest user enter all details for refer a product to friend by email and click on send message
     Then Guest user unable to refer a product to friend by email and see message display that only register user refer a product


