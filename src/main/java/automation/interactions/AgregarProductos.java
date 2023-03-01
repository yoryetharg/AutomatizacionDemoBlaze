package automation.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;

import static automation.userinterfaces.Productos.BTN_AGREGARPRODUCTO;
import static automation.userinterfaces.Productos.TXT_PRODUCTO;
import static automation.userinterfaces.Productos.TXT_CATEGORIA;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AgregarProductos implements Interaction {
    private String categoria;
    private String producto;

    public AgregarProductos(String category, String product) {
        this.categoria = category;
        this.producto = product;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(TXT_CATEGORIA.of(categoria)),
                Click.on(TXT_PRODUCTO.of(producto)),
                Click.on(BTN_AGREGARPRODUCTO));
    }

    public static Performable alCarrito(String category, String product){
        return instrumented(AgregarProductos.class, category, product);
    }
}
