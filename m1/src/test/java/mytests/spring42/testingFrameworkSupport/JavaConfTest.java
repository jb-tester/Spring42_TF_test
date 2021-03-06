package mytests.spring42.testingFrameworkSupport;

import mytests.spring42.testingFrameworkSupport.annotattions.MyCurrentProfiles;
import mytests.spring42.testingFrameworkSupport.annotattions.MyJavaContextConfig;
import mytests.spring42.testingFrameworkSupport.components.Compo1;
import mytests.spring42.testingFrameworkSupport.components.Compo2;
import mytests.spring42.testingFrameworkSupport.javaConfigs.MyConfig1;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 9/4/2015.
 * Project: TF_test
 * *******************************
 */
@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = MyConfig1.class)
//@ActiveProfiles(profiles = "p1")
@MyJavaContextConfig(configClasses = MyConfig1.class)
@MyCurrentProfiles(activeProfiles = "p1")
public class JavaConfTest {
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
