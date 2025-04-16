Feature: Validar manejo de errores de red durante la carga

  Scenario: Simular una desconexión de red al iniciar la carga
    Given el usuario navega a la página de carga
    When se simula una desconexión de red
    Then el sistema detecta la interrupción

  Scenario: Intentar reintentar la carga
    Given el usuario está en la página de carga con error de red
    When el usuario intenta reintentar la carga
    Then el sistema ofrece opción de reintento
    And muestra un mensaje de error adecuado si falla nuevamente