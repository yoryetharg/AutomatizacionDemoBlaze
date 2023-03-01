package automation.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static automation.userinterfaces.Compra.LBL_COMPRA_EXITOSA;
import static automation.utils.Constantes.COMPRA_EXITOSA;

public class ValidarCompra implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        String mensaje = LBL_COMPRA_EXITOSA.resolveFor(actor).getText();
        System.out.println(mensaje);
        return mensaje.contains(COMPRA_EXITOSA);
    }

    public static Question<Boolean> exitosa() {
        return new ValidarCompra();
    }
}
