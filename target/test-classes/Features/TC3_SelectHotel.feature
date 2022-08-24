Feature: Verify the adactin hotel select hotel details

  Scenario Outline: Verifying the adactin hotel login ,Search hotel and Select hotel with valid data
    Given User is on the AdactinHotel page
    When User should login with valid data "<userName>" and "<password>"
    Then User should verify success message after login "Hello Vignesh07!"
    When User should search the hotel with valid data "<location>","<hotels>","<roomtype>","<noOfRoom>" "<checkInDate>","<checkOutDate>","<adultsPerRoom>" and "<childrenPerRoom>"
    Then After search hotel user should verify the successful message in select hotel page "Select Hotel "
    When User should select hotel in select hotel page
    Then User should verify the successful message after select hotel "Book A Hotel"

    Examples: 
      | userName  | password    | location    | hotels         | roomtype | noOfRoom | checkInDate | checkOutDate | adultsPerRoom | childrenPerRoom |
      | Vignesh07 | Preston123@ | Los Angeles | Hotel Sunshine | Double   | 2 - Two  | 22/08/2022  | 25/08/2022   | 2 - Two       | 0 - None        |

  Scenario Outline: Verifying the adactin hotel login, Search hotel with valid data and select hotel without selecting any field in Select hotel page
    Given User is on the AdactinHotel page
    When User should login with valid data "<userName>" and "<password>"
    Then User should verify success message after login "Hello Vignesh07!"
    When User should search the hotel with valid data "<location>","<hotels>","<roomtype>","<noOfRoom>" "<checkInDate>","<checkOutDate>","<adultsPerRoom>" and "<childrenPerRoom>"
    Then After search hotel user should verify the successful message in select hotel page "Select Hotel "
    When User should click continue without selecting a hotel in select hotel page
    Then User should verify the select error message after clicking continue "Please select a Hotel"

    Examples: 
      | userName  | password    | location    | hotels         | roomtype | noOfRoom | checkInDate | checkOutDate | adultsPerRoom | childrenPerRoom |
      | Vignesh07 | Preston123@ | Los Angeles | Hotel Sunshine | Double   | 2 - Two  | 22/08/2022  | 25/08/2022   | 2 - Two       | 0 - None        |
