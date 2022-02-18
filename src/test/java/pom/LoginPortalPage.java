package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPortalPage extends BasePage {

    public LoginPortalPage(WebDriver driver) {
        super(driver);
    }

    private By TituloLogin = By.xpath("//h1[@class='subtitle']");
    private By InputTipoDocumento = By.xpath("//select[@id='_LoginPortlet_WAR_authenticationportlet_docType']");
    private By InputNumeroDocumento = By.xpath("//input[@id='_LoginPortlet_WAR_authenticationportlet_docNumber']");
    private By InputContraseña = By.xpath("//input[@id='_LoginPortlet_WAR_authenticationportlet_password']");
    private By AccionBotonIniciarSesion = By.xpath("//button[@class='btn btn-axa btn-blue btn-primary']");
    private By TituloPantallaPrincipal = By.xpath("//img[@id='picto-home']");

    public void LoginPage() throws Exception{
        getText(TituloLogin);
        System.out.println(getText(TituloLogin));
        textEquals(getText(TituloLogin), TituloLogin);
        waitImplicit(InputTipoDocumento);
    }

    public void ValorInputTipoDocumento(String Tipo_Documento) throws Exception {
        Thread.sleep(1000);
        click(InputTipoDocumento);
        selectElement(Tipo_Documento, InputTipoDocumento);
        waitImplicit(InputNumeroDocumento);
    }

    public void ValorInputNumeroDocumento(String Numero_Documento) throws Exception {
        Thread.sleep(1000);
        input(Numero_Documento, InputNumeroDocumento);
        waitImplicit(InputContraseña);
    }

    public void ValorInputContraseña(String Contraseña) throws Exception {
        Thread.sleep(1000);
        input(Contraseña, InputContraseña);
        waitImplicit(AccionBotonIniciarSesion);
    }

    public void AccionBotonIniciarSesion() throws Exception {
        Thread.sleep(1000);
        click(AccionBotonIniciarSesion);
        waitImplicit(TituloPantallaPrincipal);
    }

    public void ValidarHomePrincipal() throws Exception {
        getText(TituloPantallaPrincipal);
        textEquals(getText(TituloPantallaPrincipal), TituloPantallaPrincipal);
        Thread.sleep(2000);
    }
}
