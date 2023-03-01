package automation.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static automation.userinterfaces.Productos.LBL_PRODUCTO1;
import static automation.userinterfaces.Productos.LBL_PRODUCTO2;
import static automation.userinterfaces.Productos.LBL_TOTAL;


public class ValidarPrecio implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        String producto1 = LBL_PRODUCTO1.resolveFor(actor).getText();
        String producto2 = LBL_PRODUCTO2.resolveFor(actor).getText();
        String total = LBL_TOTAL.resolveFor(actor).getText();
        return Integer.parseInt(producto1) + Integer.parseInt(producto2) == Integer.parseInt(total);
    }

    public static Question<Boolean> deProdctosAgregados() {
        return new ValidarPrecio();
    }
}
