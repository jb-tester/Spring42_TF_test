package mytests.spring42.testingFrameworkSupport;

import mytests.spring42.testingFrameworkSupport.components.Compo1;
import mytests.spring42.testingFrameworkSupport.components.Compo2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 9/4/2015.
 * Project: TF_test
 * *******************************
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:foo.xml")
@ActiveProfiles(profiles = "p1")
public class XMLConfTest {
    @Autowired
    Compo1 myCompo1;
    @Autowired
    Compo2 myCompo2;
    @Test
    public void testAllBeans(){
        String r1 = myCompo1.getId();
        String r2 = myCompo1.getB1Arg().getStr();
        String r3 = myCompo1.getB2Arg().getStr();
        String r4 = myCompo2.getId();
        System.out.println(r1+" "+r2+" "+r3+" "+r4);
    }
}
