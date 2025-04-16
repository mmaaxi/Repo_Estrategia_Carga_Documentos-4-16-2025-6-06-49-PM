Feature: Validar carga exitosa de documento

  Scenario: Carga de documento válido
    Given que el usuario ha seleccionado un documento en formato permitido
    When el usuario hace clic en el botón 'Cargar'
    Then el documento se carga exitosamente y se muestra una confirmación
    And el documento aparece en el listado de documentos cargados