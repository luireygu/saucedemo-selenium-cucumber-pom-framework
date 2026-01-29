Feature: Login en SauceDemo
  @smoke
  Scenario: Login exitoso con credenciales válidas
    Given el usuario está en la página de login
    When ingresa usuario "standard_user" y contraseña "secret_sauce"
    Then debe ver la página de productos
@TestFailed
  Scenario: Login fallido con contraseña incorrecta
    Given el usuario está en la página de login
    When ingresa usuario "standard_user" y contraseña "wrong_password"
    Then debe ver un mensaje de error

@TestOutline
  Scenario Outline: Login exitoso
    Given el usuario está en la página de login
    When ingresa usuario "<usuario>" y contraseña "<password>"
    Then debe ver la página de productos

    Examples:
      | usuario        | password      |
      | standard_user  | secret_sauce  |
      | problem_user   | secret_sauce  |