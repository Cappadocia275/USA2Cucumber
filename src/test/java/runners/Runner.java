package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features", // feature dosyaları nerede ?
        glue = "stepdefinitions", // senaryo adımları nerede ?
        tags = "@registernewuser", // hangi testler çalışacak ?
        dryRun = false // testleri çalıştırma sadece eksik olan methodları (steps)
        // söyle (true yaparsak)
)


public class Runner {
}
