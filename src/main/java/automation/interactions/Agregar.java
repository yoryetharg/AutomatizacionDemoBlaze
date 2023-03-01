package automation.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;

import static automation.userinterfaces.Productos.BTN_AGREGARPRODUCTO;
import static automation.userinterfaces.Productos.TXT_PRODUCTO;
import static automation.userinterfaces.Productos.BTN_INICIO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Agregar implements Interaction {

    private String producto;

    public Agregar(String producto) {
        this.producto = producto;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(TXT_PRODUCTO.of(producto)),
                Click.on(BTN_AGREGARPRODUCTO));
    }

    public static Performable producto(String producto) {
        return instrumented(Agregar.class, producto);
    }

}
