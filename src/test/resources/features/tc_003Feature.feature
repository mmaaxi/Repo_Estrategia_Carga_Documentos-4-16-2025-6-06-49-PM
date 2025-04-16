Feature: Validar mensaje de error para tamaño de archivo excedido

  Scenario: Exceder tamaño máximo de archivo permitido
    Given el usuario está en la página de carga de documentos
    When el usuario selecciona un documento que excede el tamaño máximo permitido
    Then el sistema debe mostrar un mensaje de error indicando que el tamaño del archivo es excesivo

  Scenario: Intentar cargar un documento con tamaño excedido
    Given el usuario ha recibido el mensaje de error por tamaño excedido
    When el usuario intenta cargar dicho documento
    Then el sistema debe rechazar la carga y no procesar el documento