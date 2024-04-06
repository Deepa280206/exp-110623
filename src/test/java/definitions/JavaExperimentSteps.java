package definitions;

import cucumber.api.java8.En;
import org.openqa.selenium.Dimension;
import static org.assertj.core.api.Assertions.*;

import static support.TestContext.getDriver;

public class JavaExperimentSteps implements En {
    public JavaExperimentSteps() {
        Given("^we test our web application$", () -> {
            getDriver().get("https://google.com");
            getDriver().manage().window().setSize(new Dimension(800,600));
            String windowTitle = getDriver().getTitle();
            assertThat(windowTitle).isEqualTo("Google");
            System.out.println(windowTitle);
        });
    }
}
