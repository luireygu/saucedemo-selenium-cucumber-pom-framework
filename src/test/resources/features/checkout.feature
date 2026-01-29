Feature: Proceso de compra

  @TestE2E
  Scenario: Finalizar compra exitosamente
    Given el usuario tiene productos en el carrito
    When completa el formulario de compra
    Then debe ver el mensaje de compra exitosa