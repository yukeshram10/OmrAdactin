Feature: Verify the adactin hotel book a hotel details

  Scenario Outline: Verifying the adactin hotel login , Search hotel, Select hotel and Book a hotel with valid data
    Given User is on the AdactinHotel page
    When User should login with valid data "<userName>" and "<password>"
    Then User should verify success message after login "Hello Vignesh07!"
    When User should search the hotel with valid data "<location>","<hotels>","<roomtype>","<noOfRoom>" "<checkInDate>","<checkOutDate>","<adultsPerRoom>" and "<childrenPerRoom>"
    Then After search hotel user should verify the successful message in select hotel page "Select Hotel"
    When User should select hotel in select hotel page
    Then User should verify the successful message after select hotel "Book A Hotel"
    When User should book a hotel with valid data "<firstName>", "<lastName>" and "<billingAddress>"
      | creditCardNo     | creditCardtype   | expiryDate | expiryYear | cvvNo |
      | 7410852096307410 | VISA             | December   |       2022 |   741 |
      | 7410852096307410 | American Express | December   |       2022 |   741 |
      | 7410852096307410 | Master Card      | December   |       2022 |   741 |
      | 7410852096307410 | Other            | December   |       2022 |   741 |
    Then User should verify the successful message after booking a hotel "Booking Confirmation"

    Examples: 
      | userName  | password    | location    | hotels         | roomtype | noOfRoom | checkInDate | checkOutDate | adultsPerRoom | childrenPerRoom | firstName | lastName | billingAddress   |
      | Vignesh07 | Preston123@ | Los Angeles | Hotel Sunshine | Double   | 2 - Two  | 22/08/2022  | 25/08/2022   | 2 - Two       | 0 - None        | Vignesh   | R        | Greens,OMR,Dubai |

  Scenario Outline: Verifying the adactin hotel login , Search hotel, Select hotel and book with out giving any data in book a hotel page
    Given User is on the AdactinHotel page
    When User should login with valid data "<userName>" and "<password>"
    Then User should verify success message after login "Hello Vignesh07!"
    When User should search the hotel with valid data "<location>","<hotels>","<roomtype>","<noOfRoom>" "<checkInDate>","<checkOutDate>","<adultsPerRoom>" and "<childrenPerRoom>"
    Then After search hotel user should verify the successful message in select hotel page "Select Hotel"
    When User should select hotel in select hotel page
    Then User should verify the successful message after select hotel "Book A Hotel"
    When User should book without selecting any fields in book a hotel page
    Then User should verify the seven error message after booking in book a hotel page "Please Enter your First Name","Please Enter you Last Name", "Please Enter your Address", "Please Enter your 16 Digit Credit Card Number", "Please Select your Credit Card Type", "Please Select your Credit Card Expiry Month" and "Please Enter your Credit Card CVV Number"

    Examples: 
      | userName  | password    | location    | hotels         | roomtype | noOfRoom | checkInDate | checkOutDate | adultsPerRoom | childrenPerRoom | firstName | lastName | billingAddress   |
      | Vignesh07 | Preston123@ | Los Angeles | Hotel Sunshine | Double   | 2 - Two  | 22/08/2022  | 25/08/2022   | 2 - Two       | 0 - None        | Vignesh   | R        | Greens,OMR,Dubai |
