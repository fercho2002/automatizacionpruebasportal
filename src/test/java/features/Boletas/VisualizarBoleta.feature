Feature: Como usuario del portal DPW, quiero ingresar para generar una boleta y visualizarla de manera correcta

  Background:
    Given el usuario debe estar en la página de login
    When se ingresa el tipo de documento "Cédula de Ciudadanía"
    And se ingresa el numero de documento "1022391800"
    And se ingresa la contraseña "Colpatria1"
    And se presiona el botón Iniciar sesion
    Then se mostrará la pantalla principal del portal gestion

    @visualizar_boleta
    Scenario Outline: visuliar boleta
      When darle click en el sub menu consultar
      And ingresar una fecha inicial en el campo  "<fecha_inicio>"
      And ingresar una fehca final en el campo "<fecha_final>"
      And darle click en el boton buscar
      And darle click en el boton acciones
      Then darle click en el boton VER
      #Then visualizar la boleta deseada

      Examples:
      |fecha_inicio|fecha_final|
      |20/07/2021  |02/08/2021 |
