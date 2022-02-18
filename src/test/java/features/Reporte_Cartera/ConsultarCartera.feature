Feature: Como usuario del portal DPW, quiero consultar el estado de cartera

  Background:
    Given el usuario debe estar en la página de login
    When se ingresa el tipo de documento "Cédula de Ciudadanía"
    And se ingresa el numero de documento "1020678342"
    And se ingresa la contraseña "Colpatria1"
    And se presiona el botón Iniciar sesion
    Then se mostrará la pantalla principal del portal gestion

    @consultar_estado_de_Cartera
    Scenario Outline: consultar estado de cartera aplicando todos los filtros
      Given hacer click en la opcion de herramientas
      When seleccionar la opcion consultar estado de cartera
      And colocar el estado en el campo de "<estado>"
      And colocar fecha en el campo de "<fecha>"
      And colocar clave de red en el campo de "<clave_red>"
      And colocar el codigo de punto de venta en el campo de "<codigo_punto>"
      And hacer click en buscar

      Examples:
      |estado|fecha     |clave_red                            |codigo_punto                                |
      |Activo|01/09/2021|49740001 - AP. NACIONALES DE COLOMBIA|117 - AP. NACIONALES DE COLOMBIA 117 (49740)|

  @decargar_detalle_de_Cartera
  Scenario Outline: consultamos una cartera y la descargamos el detalle
    Given hacer click en la opcion de herramientas
    When seleccionar la opcion consultar estado de cartera
    And colocar el estado en el campo de "<estado>"
    And hacer click en buscar
    And dar click en descargar

    Examples:
      |estado|
      |Activo|

  @consultar_cartera_pendiente
  Scenario Outline: consultamos una cartera pendiente y se descarga el detalle automaticamente
    Given hacer click en la opcion de herramientas
    When seleccionar la opcion detalle cartera pendiente
    And colocar la fecha para el filtro en el campo de "<fecha>"
    And hacer click en ver cartera pendiente

    Examples:
      |fecha     |
      |01/10/2021|

