Feature: Validar cierre de sesión tras carga de documento

  Scenario: Cargar documento y cerrar sesión
    Given que estoy autenticado en la aplicación
    When cargo un documento exitosamente
    Then el sistema confirma la carga
    When cierro sesión
    Then el sistema cierra la sesión y solicita re-autenticación para nuevas acciones