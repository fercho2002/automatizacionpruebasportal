Feature: Como usuario del portal DPW, quiero ingresar para generar una boleta y respectivamente hacer la
  edicion de la misma

  Background:
    Given el usuario debe estar en la página de login
    When se ingresa el tipo de documento "Cédula de Ciudadanía"
    And se ingresa el numero de documento "1022391800"
    And se ingresa la contraseña "Colpatria1"
    And se presiona el botón Iniciar sesion
    Then se mostrará la pantalla principal del portal gestion

  @Editar_boleta_quitando_una_boleta
    Scenario: editar boleta
    Given hacer click en la opcion herramientas del inicio
    ##When darle click en el sub menu generar boleta de pago
    And Darle click en el boton buscar
    And seleccionar la poliza mas antigua numero uno
    And Seleccionar la poliza mas antigua numero dos
    And Darle click en el boton calcular
    And Darle click en el boton generar de la ventana amergente
    And Darle click en el boton si de la ventana emergente
    And Darle click en el boton continuar de la ventana emergente
    And Darle click en boton editar de la ventana emergente

    And deseleccionar una de las polizas atadas para pagar
    And darle click en el boton CALCULAR
    And Darle click en el boton GENERAR de la ventana emergente
    And darle click en el boton si para aceptar los cambios en la ventana emergente
    And Darle click en el boton CONTNIUAR de la ventana emergente
    And Darle click en editar nuevamente para validar los cambios hechos
    Then validar los cambios

@editar_boleta_agregando_otra
Scenario: editar boleta
  Given hacer click en la opcion herramientas del inicio
    ##When darle click en el sub menu generar boleta de pago
  And Darle click en el boton buscar
  And seleccionar la poliza mas antigua numero uno
  And Seleccionar la poliza mas antigua numero dos
  And Darle click en el boton calcular
  And Darle click en el boton generar de la ventana amergente
  And Darle click en el boton si de la ventana emergente
  And Darle click en el boton continuar de la ventana emergente
  And Darle click en boton editar de la ventana emergente

  And darle click al boton agregar
  And seleccionar la poliza para agregar
  And Darle click en el boton CALCULAR de la ventana emergente
  And darle click en el boton GENERAR2 de la ventana emergente
  And Darle click en el boton SI de la ventana emergente
  And DARLE CLICL AL BOTON CONTINUAR DE LA VENTANA EMERGENTE
  And Darle click en boton editar de la ventana emergente
  Then validar los cambios






