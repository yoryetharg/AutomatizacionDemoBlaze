package automation.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static automation.userinterfaces.CrearUsuario.LBL_USUARIO;
import static automation.utils.Constantes.NOMBRE_NUEVO_USUARIO;

public class ValidarUsuario implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        String nombreUsuario = LBL_USUARIO.resolveFor(actor).getText();
        return nombreUsuario.contains(NOMBRE_NUEVO_USUARIO);
    }

    public static Question<Boolean> creadoExitosamente() {
        return new ValidarUsuario();
    }
}
