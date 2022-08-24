Feature: Verify the adactin hotel search hotel details

  Scenario Outline: Verify the adactin hotel login page with the valid datas and search hotel by select all fields in search hotel page
    Given User is on the AdactinHotel page
    When User should login with valid data "<userName>" and "<password>"
    Then User should verify success message after login "Hello Vignesh07!"
    When User should search the hotel with valid data "<location>","<hotels>","<roomtype>","<noOfRoom>" "<checkInDate>","<checkOutDate>","<adultsPerRoom>" and "<childrenPerRoom>"
    Then After search hotel user should verify the successful message in select hotel page "Select Hotel"

    Examples: 
      | userName  | password    | location    | hotels         | roomtype | noOfRoom | checkInDate | checkOutDate | adultsPerRoom | childrenPerRoom |
      | Vignesh07 | Preston123@ | Los Angeles | Hotel Sunshine | Double   | 2 - Two  | 18/08/2022  | 19/08/2022   | 2 - Two       | 0 - None        |

  Scenario Outline: Verify the adactin hotel login page with the valid datas and search hotel by selecting mandatory fields in search hotel page
    Given User is on the AdactinHotel page
    When User should login with valid data "<userName>" and "<password>"
    Then User should verify success message after login "Hello Vignesh07!"
    When User should search the hotel with valid data only in mandatory fields "<location>","<noOfRoom>" "<checkInDate>","<checkOutDate>" and "<adultsPerRoom>"
    Then After search hotel user should verify the successful message in select hotel page "Select Hotel "

    Examples: 
      | userName  | password    | location    | noOfRoom | checkInDate | checkOutDate | adultsPerRoom |
      | Vignesh07 | Preston123@ | Los Angeles | 2 - Two  | 22/08/2022  | 25/08/2022   | 2 - Two       |

  Scenario Outline: Verify the adactin hotel login page with the valid datas and to get error msg in date fields by giving invalid data in search hotel page
    Given User is on the AdactinHotel page
    When User should login with valid data "<userName>" and "<password>"
    Then User should verify success message after login "Hello Vignesh07!"
    When User should search the hotel with invalid data "<location>","<hotels>","<roomtype>","<noOfRoom>" "<checkInDate>","<checkOutDate>","<adultsPerRoom>" and "<childrenPerRoom>"
    Then User should verify the date error msg in search hotel page date field "Check-In Date shall be before than Check-Out Date","Check-Out Date shall be after than Check-In Date" after click the search in search hotel page

    Examples: 
      | userName  | password    | location    | hotels         | roomtype | noOfRoom | checkInDate | checkOutDate | adultsPerRoom | childrenPerRoom |
      | Vignesh07 | Preston123@ | Los Angeles | Hotel Sunshine | Double   | 2 - Two  | 19/08/2022  | 17/08/2022   | 2 - Two       | 0 - None        |

  Scenario Outline: Verify the adactin hotel login page with the valid datas and to get error msg in location field  without selecting any fields in search hotel page
    Given User is on the AdactinHotel page
    When User should login with valid data "<userName>" and "<password>"
    Then User should verify success message after login "Hello Vignesh07!"
    When User should click search in search hotel page without selecting any fields
    Then User should verify the location error msg in search hotel page location field "Please Select a Location" after clicking search

    Examples: 
      | userName  | password    |
      | Vignesh07 | Preston123@ |
