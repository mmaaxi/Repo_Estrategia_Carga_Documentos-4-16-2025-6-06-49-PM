Feature: Validar registro y log de actividad de carga

  Scenario: Registro y revisión de una carga de documento
    Given el usuario está en la página de carga de documentos
    When el usuario sube un documento
    Then el sistema debe registrar la actividad de la carga en el log
    And el log debe contener detalles como usuario, fecha y estado de la carga