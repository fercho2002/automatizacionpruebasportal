Feature: Como usuario del portal DPW, quiero ingresar para generar una boleta y respectivamente hacer el pago
  de la misma

  Background:
    Given el usuario debe estar en la página de login
    When se ingresa el tipo de documento "Cédula de Ciudadanía"
    And se ingresa el numero de documento "1020678342"
    And se ingresa la contraseña "Colpatria1"
    And se presiona el botón Iniciar sesion
    Then se mostrará la pantalla principal del portal gestion

  @consultar_reporte_boleta
    Scenario Outline: Consultar Reporte de Boleta
    Given hacer click en la opcion de herramientas en el menu principal
    When seleccione la opcion de Reporte Boltas de pago
    And ingrese la fecha de creacion desde "<fecha_desde>"
    And ingrese la fecha de creacion hasta "<fecha_hasta>"
    And ingresar el estado de la boleta "<estado>"
    And ingresar la clave de red "<clave>"
    And ingresar el codigo de punto de venta "<punto>"
    And dar click en el boton de buscar

    Examples:
    |fecha_desde|fecha_hasta|estado  |clave|punto|
    |01/06/2021 |01/11/2021 |        |     |     |

  @descargar_reporte_boleta
  Scenario Outline: Consultar Reporte de Boleta
    Given hacer click en la opcion de herramientas en el menu principal
    When seleccione la opcion de Reporte Boltas de pago
    And ingrese la fecha de creacion desde "<fecha_desde>"
    And ingrese la fecha de creacion hasta "<fecha_hasta>"
    And ingresar el estado de la boleta "<estado>"
    And ingresar la clave de red "<clave>"
    And ingresar el codigo de punto de venta "<punto>"
    And dar click en el boton de buscar
    And dar click en el boton de descargar

    Examples:
      |fecha_desde|fecha_hasta|estado  |clave|punto|
      |01/06/2021 |01/11/2021 |        |     |     |
