Feature:yo como usuario quiero en la funcionalidad de Generar boleta calcular y generar boletas de pago


  Background:

  Given el usuario debe estar en la página de login
  When se ingresa el tipo de documento "Cédula de Ciudadanía"
  And se ingresa el numero de documento " 1022391800  "
  And se ingresa la contraseña "Colpatria1"
  And se presiona el botón Iniciar sesion
  Then se mostrará la pantalla principal del portal gestion

  @filtroBoletasPago
  Scenario Outline: filtrar informacion en la pantalla
    And Ingresar a menu Herramientas
    When Ingresar al submenu generar boletas de pago
    And ingresar la fecha desde"<fecha_desde>"
    And ingresar la fecha hasta"<fecha_hasta>"
    And ingresar numero poliza"<poliza>"
    And ingresar numero de placa"<placa>"
    And Seleccionar clave de red"<clave_red>"
    And Realizar clic en el boton buscar
    Then se mostrara la informacion en una tabla

    Examples:
    |poliza           |placa     | clave_red            |fecha_desde          |fecha_hasta        |
    |    4104600600   |XP010     |    475701 - 475701     | 02/06/2019          | 16/06/2021        |
       # |    4104596500   |BOL141    |    475702 -  475702   | 02/06/2019          | 16/06/2021        |
  #|    	4104389000  |CNO123    |    475703 -    475703  | 02/06/2019          | 16/06/2021        |






  @calcular_boletas_de_pago
  Scenario Outline: calcular el total de la boletas de pago
    And Ingresar a menu Herramientas
    When Ingresar al submenu generar boletas de pago
    And ingresar la fecha desde"<fecha_desde>"
    And ingresar la fecha hasta"<fecha_hasta>"
    And ingresar numero poliza"<poliza>"
    And ingresar numero de placa"<placa>"
    And Seleccionar clave de red"<clave_red>"
    And Realizar clic en el boton buscar
    Then se mostrara la informacion en una tabla
    And Realizar clic en el check del primer filtro
    And Realizar clic en el check del segundo filtro
    And Realizar clic en el boton calcular
    Then se mostrara una tabla flotante con la informacion
Examples:
  |poliza           |placa     | clave_red            |fecha_desde          |fecha_hasta        |
  #|                 |          |    475701 - 475701   |                     |                  |
  |                 |          |  475702 - 475702  |                        |         |
  #|    	  |   |    475703 -    475703  | 02/06/2019          | 16/06/2021        |

  @Generar_boleta_pago
  Scenario Outline:Generar boleta de pago en pantalla
    And Ingresar a menu Herramientas
    When Ingresar al submenu generar boletas de pago
    And ingresar la fecha desde"<fecha_desde>"
    And ingresar la fecha hasta"<fecha_hasta>"
    And ingresar numero poliza"<poliza>"
    And ingresar numero de placa"<placa>"
    And Seleccionar clave de red"<clave_red>"
    And Realizar clic en el boton buscar
    Then se mostrara la informacion en una tabla
    And Realizar clic en el check del primer filtro
    And Realizar clic en el check del segundo filtro
    And Realizar clic en el boton calcular
    And se mostrara una tabla flotante con la informacion
    And Realizar clic en el boton generar
    And aparecera una mensaje desea continuar?
    And Realizar clic en el boton si
    And aparecera un mensaje la boleta se ha creado exitosamente
    And Realizar clic en el boton continuar
    Then se mostrara un tabla con informacion
 Examples:
   |poliza           |placa     |clave_red             |fecha_desde          |fecha_hasta        |
   |                 |          |    475701 - 475701   |                     |                   |
   #|                  |          |    475702 - 475702  | 02/06/2019          | 16/06/2021        |
  #|    	         |          |    475703 - 475703   | 02/06/2019          | 16/06/2021        |
