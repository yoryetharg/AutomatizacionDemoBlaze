package automation.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Compra {
    public static final Target BTN_ORDEN_COMPRA =
            Target.the("order").located(By.xpath("//button[contains(text(),'Place Order')]"));
    public static final Target TXT_NOMBRE =
            Target.the("name pay").located(By.xpath("//input[@id='name']"));
    public static final Target TXT_PAIS =
            Target.the("country pay").located(By.xpath("//input[@id='country']"));
    public static final Target TXT_CIUDAD =
            Target.the("city pay").located(By.xpath("//input[@id='city']"));
    public static final Target TXT_TARJETA_CREDITO =
            Target.the("credit card").located(By.xpath("//input[@id='card']"));
    public static final Target TXT_MES =
            Target.the("month").located(By.xpath("//input[@id='month']"));
    public static final Target TXT_ANIO =
            Target.the("year").located(By.xpath("//input[@id='year']"));
    public static final Target BTN_FINALIZAR_COMPRA =
            Target.the("button pay").located(By.xpath("//button[contains(text(),'Purchase')]"));
    public static final Target LBL_COMPRA_EXITOSA =
            Target.the("Label compra exitosa").located(By.xpath("//div[@tabindex='-1']/h2"));

}
