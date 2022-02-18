Feature:yo como usuario  de portal DPW,quiero calcular la boleta de pago

  Background:

    Given el usuario debe estar en la página de login
    When se ingrese el tipo de documento "Cédula de Ciudadanía"
    And se ingresa el numero de documento " 1022391800  "
    And se ingresa la contraseña "Colpatria1"
    And se presiona el botón Iniciar sesion
    Then se mostrará la pantalla principal del portal gestion



  @calcular_boletas_de_pago_un_check
  Scenario Outline: calcular el total de la boletas de pago
    And Ingresar a menu Herramientas
    When Ingresar al submenu generar boletas de pago
    And ingresar la fecha desde"<fecha_desde>"
    And ingresar la fecha hasta"<fecha_hasta>"
    And ingresar numero poliza"<poliza>"
    And ingresar numero de placa"<placa>"
    And Seleccionar clave de red"<clave_red>"
    And Realizar clic en el boton buscar
    And se mostrara la informacion en una tabla
    And Realizar clic en el check del primer filtro
    And Realizar clic en el check del segundo filtro
    And Realizar clic en el boton calcular
    Then se mostrara una tabla flotante con la informacion
    Examples:
      |poliza           |placa     | clave_red            |fecha_desde          |fecha_hasta        |
  |                 |          |    475701 - 475701   |                     |                  |
   #   |                 |          |  475702 - 475702  |                        |         |
  #|    	  |   |    475703 -    475703  | 02/06/2019          | 16/06/2021        |


  @calcular_boletas_de_pago_dos_check
Scenario Outline: calcular el total de la boletas de pago
And Ingresar a menu Herramientas
When Ingresar al submenu generar boletas de pago
And ingresar la fecha desde"<fecha_desde>"
And ingresar la fecha hasta"<fecha_hasta>"
And ingresar numero poliza"<poliza>"
And ingresar numero de placa"<placa>"
And Seleccionar clave de red"<clave_red>"
And Realizar clic en el boton buscar
And se mostrara la informacion en una tabla
And Realizar clic en el check del primer filtro
And Realizar clic en el check del segundo filtro
And Realizar clic en el boton calcular
Then se mostrara una tabla flotante con la informacion
Examples:
|poliza           |placa     | clave_red            |fecha_desde          |fecha_hasta        |
  #|                 |          |    475701 - 475701   |                     |                  |
|                 |          |  475702 - 475702  |                        |         |
  #|    	  |   |    475703 -    475703  | 02/06/2019          | 16/06/2021        |





