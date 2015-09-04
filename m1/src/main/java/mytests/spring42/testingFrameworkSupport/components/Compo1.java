package mytests.spring42.testingFrameworkSupport.components;

import mytests.spring42.testingFrameworkSupport.beans.B1;
import mytests.spring42.testingFrameworkSupport.beans.B2;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 9/4/2015.
 * Project: TF_test
 * *******************************
 */
public interface Compo1 {
    String getId();

    B1 getB1Arg();

    B2 getB2Arg();
}
