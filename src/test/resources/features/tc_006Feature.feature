Feature: Validar compatibilidad en diferentes navegadores

  Scenario: Verificar carga del sistema en Chrome, Firefox y Edge
    Given el usuario abre el navegador "Chrome"
    When el usuario accede al sistema
    Then la funcionalidad de carga se visualiza correctamente

    Given el usuario abre el navegador "Firefox"
    When el usuario accede al sistema
    Then la funcionalidad de carga se visualiza correctamente

    Given el usuario abre el navegador "Edge"
    When el usuario accede al sistema
    Then la funcionalidad de carga se visualiza correctamente

  Scenario: Verificar carga de documento en diferentes navegadores sin errores
    Given el usuario abre el navegador "Chrome"
    When el usuario carga un documento
    Then el sistema procesa la carga sin errores

    Given el usuario abre el navegador "Firefox"
    When el usuario carga un documento
    Then el sistema procesa la carga sin errores

    Given el usuario abre el navegador "Edge"
    When el usuario carga un documento
    Then el sistema procesa la carga sin errores