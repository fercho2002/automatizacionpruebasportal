Feature: Como usuario del portal DPW, quiero ingresar para generar una boleta y respectivamente hacer el pago
  de la misma

  Background:
    Given el usuario debe estar en la página de login
    When se ingresa el tipo de documento "Cédula de Ciudadanía"
    And se ingresa el numero de documento "1020678342"
    And se ingresa la contraseña "Colpatria1"
    And se presiona el botón Iniciar sesion
    Then se mostrará la pantalla principal del portal gestion

    @pagar_boleta
    Scenario Outline: pagar boleta
      Given hacer click en la OPCION herramientas del inicio
      When Darle click en el BOTON buscar
      And seleccionar la primera poliza
      And Seleccionar la segunda poliza
      And Darle click en el BOTON calcular
      And Darle click en el BOTON generar de la ventana amergente
      And Darle click en el BOTON si de la ventana emergente
      And Darle click en el BOTON continuar de la ventana emergente
      And Darle click en boton pagar de la ventana emergente
      And Colocar un numero de telefono en "<telefono>"
      And Colocar una direccion en el campo "<direccion>"
      And Colocar una ciudad en el campo "<ciudad_residencia>"
      And Darle Click en el cuadro para aceptar las condiciones
      And darle click en el boton pagar del portal
      And ingresar un banco en "<banco>"
      And Darle click en continuar
      And ingresar un correo en "<correo>"
      And darle click en ir al banco
      And darle click en el boton debug
      And colocar la fecha actual en "<fecha>"
      And colocar el numero de autorizacion en "<numero>"
      And Darle click en el boton
      And Darle click en el boton return to PPE

    Examples:
    |telefono  |direccion       |ciudad_residencia|banco                      |correo                     |   fecha       |numero|
    |3118755831|call 92 NO 23-12|BOGOTA / BOGOTA  |BANCO UNION COLOMBIANO     |nestor.lerma@vasslatam.com |  02/07/2021    | 12   |