package seleniumgluecode.Boletas;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import seleniumgluecode.TestBase;

public class Test_boletaspago extends TestBase {
    
    @And("^Ingresar a menu Herramientas$")
    public void ingresar_a_menu_Herramientas() throws Throwable {
     BoletasPagoPage.menu() ;
    }

    @When("^Ingresar al submenu generar boletas de pago$")
    public void ingresar_al_submenu_generar_boletas_de_pago() throws Throwable {
        BoletasPagoPage.submenu() ;
    }

    @And("^ingresar la fecha desde\"([^\"]*)\"$")
    public void ingresar_la_fecha_desde(String fecha_desde) throws Throwable {
     BoletasPagoPage.fechasd(fecha_desde);
    }

    @And("^ingresar la fecha hasta\"([^\"]*)\"$")
    public void ingresar_la_fecha_hasta(String fecha_hasta) throws Throwable {
        BoletasPagoPage.fechash(fecha_hasta);
    }

    @And("^ingresar numero poliza\"([^\"]*)\"$")
    public void ingresar_numero_poliza(String poliza) throws Throwable {
        BoletasPagoPage.polizas(poliza);
    }

    @And("^ingresar numero de placa\"([^\"]*)\"$")
    public void ingresar_numero_de_placa(String placa) throws Throwable {
        BoletasPagoPage.placas(placa);
    }

    @And("^Seleccionar clave de red\"([^\"]*)\"$")
    public void seleccionar_clave_de_red(String clave_red) throws Throwable {
        BoletasPagoPage.red(clave_red);
    }

    @And("^Realizar clic en el boton buscar$")
    public void realizar_clic_en_el_boton_buscar() throws Throwable {
        BoletasPagoPage.buscar();

    }
    @And("^Realizar clic en el check del primer filtro$")
    public void realizar_clic_en_el_check_del_primer_filtro() throws Throwable {
     BoletasPagoPage.Checkuno();
    }

    @And("^Realizar clic en el check del segundo filtro$")
    public void realizar_clic_en_el_check_del_segundo_filtro() throws Throwable {
        BoletasPagoPage.checkdos() ;
    }

    @And("^Realizar clic en el boton calcular$")
    public void realizar_clic_en_el_boton_calcular() throws Throwable {
    BoletasPagoPage.calcular()  ;
    }

    @Then("^se mostrara una tabla flotante con la informacion$")
    public void se_mostrara_una_tabla_flotante_con_la_informacion() throws Throwable {

    }

    @And("^Realizar clic en el boton generar$")
    public void realizar_clic_en_el_boton_generar() throws Throwable {
     BoletasPagoPage.generar();
    }

    @And("^aparecera una mensaje desea continuar\\?$")
    public void aparecera_una_mensaje_desea_continuar() throws Throwable {
    BoletasPagoPage.mensaje();
    }

    @And("^Realizar clic en el boton si$")
    public void realizar_clic_en_el_boton_si() throws Throwable {
    BoletasPagoPage.si();
    }

    @And("^aparecera un mensaje la boleta se ha creado exitosamente$")
    public void aparecera_un_mensaje_la_boleta_se_ha_creado_exitosamente() throws Throwable {
     BoletasPagoPage.mensajeboleta() ;
    }

    @And("^Realizar clic en el boton continuar$")
    public void realizar_clic_en_el_boton_continuar() throws Throwable {
     BoletasPagoPage.continuar();
    }

    @Then("^se mostrara un tabla con informacion$")
    public void se_mostrara_un_tabla_con_informacion() throws Throwable {

    }

    @Then("^se mostrara la informacion en una tabla$")
    public void se_mostrara_la_informacion_en_una_tabla() throws Throwable {

    }

}
