Feature: Validar carga desde dispositivo móvil

  Scenario: Subir un documento desde un dispositivo móvil
    Given el usuario accede al sistema desde un dispositivo móvil
    Then el sistema adapta la interfaz para móviles
    When el usuario selecciona y carga un documento
    Then el documento se carga correctamente y se muestra la confirmación