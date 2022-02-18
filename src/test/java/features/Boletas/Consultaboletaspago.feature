Feature:yo como usuario quiero consultar una boleta de pago en pantalla

  Background:

    Given el usuario debe estar en la página de login
    When se ingresa el tipo de documento "Cédula de Ciudadanía"
    And se ingresa el numero de documento "1020678342"
    And se ingresa la contraseña "Colpatria1"
    And se presiona el botón Iniciar sesion
    Then se mostrará la pantalla principal del portal gestion

    @Consulta_boletas_pago
  Scenario Outline: Consultar boletas de pago
    And Ingresar a menu Herramientas
    When Ingresar al submenu consultar boletas de pago
    And ingresar la fecha desde"<fecha_desde>"
    And ingresar la fecha hasta"<fecha_hasta>"
    And ingresar numero boleta"<boleta>"
    And ingresar numero poliza"<poliza>"
    And Seleccione el estado"<estado>"
    And Seleccione la clave de red"<clave_red>"
    And Seleccione el punto de venta "<punto_venta>"
    And Realizar clic en el boton Buscar
    Then se mostrara una tabla flotante con la informacion
    Examples:

      | fecha_desde        |fecha_hasta             | boleta          |poliza     |estado    |clave_red          |punto_venta                     |
      |05/08/2019        |    31/08/2021          | 	122959        | 4         | GENERADO | 475701 - 475701   | 475701 - 475701-1 (4757)       |
      |05/08/2019        |    31/08/2021          | 	              |           |RECAUDADO | 475702 - 475702   | 475702 - 475701-2 (4757)       |
      |05/08/2019        |    31/08/2021          | 	              |           |DESCARGADO| 475703 - 475703   | 475703 - 475701-3 (4757)       |

  @generar_pago_consulta
  Scenario Outline: Consultar boletas de pago y pagar
    And Ingresar a menu Herramientas
    When Ingresar al submenu consultar boletas de pago
    And ingresar la fecha desde consultar"<fecha_desde>"
    And ingresar la fecha hasta consultar"<fecha_hasta>"
    And ingresar numero boleta"<boleta>"
    And Realizar clic en el boton Buscar
    And darle click en el boton acciones
    And Dar click en pagar
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
      | fecha_desde        |fecha_hasta             | boleta          |poliza     |estado    |telefono  |direccion       |ciudad_residencia|banco                      |correo                     |   fecha       |numero|
      |01/06/2021          |    02/10/2021          | 	125482        | 9         | GENERADO |3118357830|call 92 NO 23-12|BOGOTA / BOGOTA  |BANCO UNION COLOMBIANO     |nestor.lerma@vasslatam.com |  03/11/2021    | 12   |
