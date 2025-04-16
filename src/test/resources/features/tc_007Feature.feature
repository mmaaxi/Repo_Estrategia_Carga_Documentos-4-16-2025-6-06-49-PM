Feature: Validate response time when uploading a document

  Scenario: Validate document upload response time
    Given I select a medium-sized document
    When I measure the time until the upload confirmation
    Then The response time is within the acceptable limit