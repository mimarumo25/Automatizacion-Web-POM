package pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("https://www.mercadolibre.com.co/")
public class ExitoPage extends PageObject {

    @FindBy(xpath = "//button[@data-js='onboarding-cp-close']")
    public WebElement btnAlerta;
    @FindBy(xpath = "//input[@id=\"cb1-edit\"]")
    public WebElement inputBuscar;
    @FindBy(css = "div[aria-label='Buscar']")
    public WebElement btnBuscar;
    @FindBy(xpath = "(//h2[@class='ui-search-item__title shops__item-title'])[1]")
    public WebElement linkPrdocutoBuscado;
    @FindBy(xpath = "(//*[@id=\"buybox-form\"]//*/button[2])[1]")
    public WebElement btnAgregarCarrito;
    @FindBy(xpath = "//a[@id='registration-link']")
    public WebElement btnCrearCuenta;
    @FindBy(css = "input#terms-and-conds")
    public WebElement inputTerminos;
    @FindBy(xpath = "//a[@class='andes-button andes-button--large andes-button--loud']")
    public WebElement btnCrearCuentaPersonal;

    @FindBy(xpath = "//button[@data-testid='action:understood-button']")
    public WebElement btnCokies;

    @FindBy(xpath = "//button[@type='button']")
    public WebElement btnAgregar;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement inputEmail;

    @FindBy(css = "button[type='submit']")
    public WebElement btnContinuar;
    @FindBy(xpath = " //button[@type='button']")
    public WebElement btnConfirmaContinuar;

    @FindBy(xpath = "//button[@class='andes-button hub-item__button andes-button--medium andes-button--loud']")
    public WebElement btnElegirNombre;
    @FindBy(xpath = "//input[@title='Nombre']")
    public WebElement inputNombres;
    @FindBy(xpath = "//input[@title='Apellido']")
    public WebElement inputApellidos;
    @FindBy(xpath = "//button[@type='post']")
    public WebElement btnContinuarDatos;
    @FindBy(xpath = "//button[@type='button']")
    public WebElement btnConfirmaNombre;

}
