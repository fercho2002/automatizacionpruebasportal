Feature: Como usuario del portal DPW quiero autenticarme en el login para
  poder acceder a las funcionalidades de boletas, cartera y autenticacion.

  @Login
  Scenario Outline: Ingresar al login del portal DPW-Proveedores

    Given el usuario debe estar en la página de login
    When se ingresa el tipo de documento "<Tipo_Documento>"
    And se ingresa el numero de documento "<Numero_Documento>"
    And se ingresa la contraseña "<Contraseña>"
    And se presiona el botón Iniciar sesion
    Then se mostrará la pantalla principal del portal gestion

    Examples:
      |Tipo_Documento       |Numero_Documento | Contraseña |
      |Cédula de Ciudadanía |111222333        | Colpatria1 |