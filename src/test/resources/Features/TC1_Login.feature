Feature: Verify the adactin hotel login page details

  Scenario Outline: Verify the adactin hotel login page with the valid datas
    Given User is on the AdactinHotel page
    When User should login with valid data "<userName>" and "<password>"
    Then User should verify success message after login "Hello Vignesh07!"

    Examples: 
      | userName  | password    |
      | Vignesh07 | Preston123@ |

  Scenario Outline: Verify the adactin hotel login page with the valid datas using Enter
    Given User is on the AdactinHotel page
    When User should login with valid data "<userName>" and "<password>" using Enter
    Then User should verify success message after login "Hello Vignesh07!"

    Examples: 
      | userName  | password    |
      | Vignesh07 | Preston123@ |

  Scenario Outline: Verify the adactin hotel login page with the invalid data
    Given User is on the AdactinHotel page
    When User should login with invalid Data "<userName>" and "<password>"
    Then User should verify the login error messages after clicking login "Invalid Login details or Your Password might have expired."

    Examples: 
      | userName | password    |
      | Vignesh  | Preston123@ |
