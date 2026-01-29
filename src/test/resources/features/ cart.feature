Feature: Carrito de compras

  @TestAddProductCart
  Scenario: Agregar producto al carrito
    Given el usuario está logueado
    When agrega un producto al carrito
    Then el carrito debe mostrar 1 producto