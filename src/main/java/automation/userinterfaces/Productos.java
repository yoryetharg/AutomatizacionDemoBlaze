package automation.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Productos {

    public static final Target TXT_PRODUCTO =
            Target.the("Producto").locatedBy("//a[contains(text(),'{0}')]");
    public static final Target BTN_AGREGARPRODUCTO =
            Target.the("Agregar producto").locatedBy("//a[text()='Add to cart']");
    public static final Target BTN_INICIO =
            Target.the("Boton inicio").locatedBy("//a[contains(text(),'Home')]");
    public static final Target BTN_IRACARRITO =
            Target.the("Ir a carrito").locatedBy("//a[contains(text(),'Cart')]");
    public static final Target LBL_PRODUCTO1 =
            Target.the("Label precio producto 1").locatedBy("//div[@id='page-wrapper']//tr[@class='success'][1]//td[3]");
    public static final Target LBL_PRODUCTO2 =
            Target.the("Label precio producto 2").locatedBy("//div[@id='page-wrapper']//tr[@class='success'][2]//td[3]");
    public static final Target LBL_TOTAL =
            Target.the("Label total").locatedBy("//h3[@id='totalp']");
    public static final Target TXT_CATEGORIA =
            Target.the("Categoria").locatedBy("//a[contains(text(),'{0}')]");
}
