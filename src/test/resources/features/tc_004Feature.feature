Feature: Validar control de acceso no autorizado

  Scenario: Intentar acceder a la funcionalidad de carga sin autenticación
    Given el usuario intenta acceder a la carga de funcionalidades sin autenticarse
    Then el sistema redirige al usuario a la página de login

  Scenario: Ingresar credenciales incorrectas
    Given el usuario está en la página de login
    When el usuario ingresa credenciales incorrectas
    Then el sistema muestra un mensaje de error de autenticación