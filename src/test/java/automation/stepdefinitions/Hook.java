package automation.stepdefinitions;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;

public class Hook {

    @Before
    public void doBefore() {
        setTheStage(new OnlineCast());
    }

}

