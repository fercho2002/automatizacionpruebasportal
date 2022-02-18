Feature: Como usuario del portal DPW, quiero buscar todos los usuarios que hay, aplicando los filtro correspondientes

  Background:
    Given el usuario debe estar en la página de login
    When se ingresa el tipo de documento "Cédula de Ciudadanía"
    And se ingresa el numero de documento "1020678342"
    And se ingresa la contraseña "Colpatria1"
    And se presiona el botón Iniciar sesion
    Then se mostrará la pantalla principal del portal gestion

    @consultar_gestion_de_usuarios
      Scenario: buscar usuarios sin aplicar ningun filtro
      Given hacer click en la OPCION de herramientas
      When seleccione la OPCION de gestion de usuarios
      And hacer click en la opcion de buscar


    @cambiar_estado_de_el_usuario
    Scenario Outline: buscar usuarios inhabilitados
      Given hacer click en la OPCION de herramientas
      When seleccione la OPCION de gestion de usuarios
      And colocar el estado en el campo "<estado>"
      And colocar clave de red en el campo "<clave_red>"
      And colocar el codigo de punto de venta en el campo "<codigo_punto>"
      And hacer click en la opcion de buscar
      And selecciuonar el estado como activo "<estado2>"
      And dar click en guardar
      And dar click en si en la pantalla emergente

      Examples:
      |estado      |clave_red                            |codigo_punto                                |estado2|
      |INHABILITADO|49740001 - AP. NACIONALES DE COLOMBIA|117 - AP. NACIONALES DE COLOMBIA 117 (49740)|ACTIVO |

    @seleccionar_la_casilla_activar_todos
    Scenario: buscar usuarios sin aplicar ningun filtro
      Given hacer click en la OPCION de herramientas
      When seleccione la OPCION de gestion de usuarios
      And hacer click en la opcion de buscar
      And seleccionar la casilla de activar todos
      #And dar click en guardar
      #And dar click en si en la pantalla emergente