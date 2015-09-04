package mytests.spring42.testingFrameworkSupport.components;

import mytests.spring42.testingFrameworkSupport.beans.B1;
import mytests.spring42.testingFrameworkSupport.beans.B2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 9/4/2015.
 * Project: TF_test
 * *******************************
 */
@Component
@Profile("p1")
public class Compo1P1 implements Compo1 {
    @Value("compo1_p1")
    String id;
    @Autowired
    private B1 b1Arg;
    @Autowired
    private B2 b2Arg;

    @Override
    public String getId() {
        return id;
    }

    @Override
    public B1 getB1Arg() {
        b1Arg.setStr("b1_p1");
        return b1Arg;
    }

    @Override
    public B2 getB2Arg() {
        b2Arg.setStr("b2_p1");
        return b2Arg;
    }

}
