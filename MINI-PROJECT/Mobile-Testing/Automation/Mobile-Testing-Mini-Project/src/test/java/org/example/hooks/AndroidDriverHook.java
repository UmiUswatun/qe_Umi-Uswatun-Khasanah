package org.example.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.example.app.drivers.AndroidDriverInit;

public class AndroidDriverHook {
    @Before(value = "@android")
    public void beforeScenario() {
        AndroidDriverInit.initialize();
    }

    @After(value = "@android")
    public void afterScenario(Scenario scenario) {
        AndroidDriverInit.quit();
    }
}
