Feature: Como usuario del portal DPW, quiero ingresar a la opcion de consultar boleta y en este caso quiero anular una boleta
  Background:
    Given el usuario debe estar en la página de login
    When se ingresa el tipo de documento "Cédula de Ciudadanía"
    And se ingresa el numero de documento "1020678342"
    And se ingresa la contraseña "Colpatria1"
    And se presiona el botón Iniciar sesion
    Then se mostrará la pantalla principal del portal gestion

    @anular_boleta
    Scenario Outline:
      Given hacer click en la ventana de herramientas de la pantallaprincipal
      When hacer click en la opcion de consultar boletas
      And ingresar la fecha creacion desde  con el campo"<fecha_desde>"
      And ingresar la fecha creacion hasta con el campo"<fecha_hasta>"
      And seleccionar el estado con el campo "<estado>"
      And hacer click en el boton de buscar
      And en la primera boleta seleccionar la opcion de anular con el campo "<anular>"
      And hacer click en si para confirmar la anulacion de la boleta
      And Hacer click para confirmar que se anulo la boleta corectamente

      Examples:
      |fecha_desde|fecha_hasta|estado  |anular|
      |01/08/2021 |01/11/2021 |GENERADO|Anular|
