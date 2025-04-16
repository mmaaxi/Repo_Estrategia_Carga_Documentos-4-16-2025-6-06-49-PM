Feature: Upload documents
  Scenario: Validate error when uploading unsupported file format
    Given I am on the document upload page
    When I select an unsupported file format
    Then the system should reject the file and display an error message
    When I attempt to upload the document
    Then the upload should be blocked and inform the user about the unsupported format