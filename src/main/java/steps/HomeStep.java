package steps;

import net.thucydides.core.annotations.Step;
import pages.ExitoPage;
import util.Util;


public class HomeStep {
    private ExitoPage exitoPage;
    private Util util;

    @Step
    public void openBrowser() {
        exitoPage.open();
    }

    @Step
    public void buscarProducto(String producto) throws InterruptedException {
        exitoPage.btnAlerta.click();
        exitoPage.inputBuscar.sendKeys(producto);
        exitoPage.btnBuscar.click();
    }

    @Step
    public void agregarCarrito() throws InterruptedException {
        exitoPage.linkPrdocutoBuscado.click();
        exitoPage.btnCokies.click();
        exitoPage.btnAgregarCarrito.click();

    }

    @Step
    public void CrearCuentaPersonal(String email,String nombres, String apellidos) throws InterruptedException {
        exitoPage.btnCrearCuenta.click();
        exitoPage.inputTerminos.click();
        exitoPage.btnCrearCuentaPersonal.click();
        exitoPage.btnAgregar.click();
        exitoPage.inputEmail.sendKeys(email);
        exitoPage.btnContinuar.click();
        exitoPage.btnAgregar.click();
        exitoPage.inputNombres.sendKeys(nombres);
        exitoPage.inputNombres.sendKeys(apellidos);
        exitoPage.btnContinuar.click();
    }
}
