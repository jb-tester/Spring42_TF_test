package mytests.spring42.testingFrameworkSupport.components;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 9/4/2015.
 * Project: TF_test
 * *******************************
 */
@Component
public class Compo2 {
    @Value("compo2")
    String id;

    public String getId() {
        return id;
    }
}
