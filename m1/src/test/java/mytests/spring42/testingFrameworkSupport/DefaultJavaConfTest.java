package mytests.spring42.testingFrameworkSupport;

import mytests.spring42.testingFrameworkSupport.annotattions.MyJavaContextConfig;
import mytests.spring42.testingFrameworkSupport.beans.B1;
import mytests.spring42.testingFrameworkSupport.beans.B2;
import mytests.spring42.testingFrameworkSupport.components.Compo1;
import mytests.spring42.testingFrameworkSupport.components.Compo2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 9/4/2015.
 * Project: TF_test
 * *******************************
 */
@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(loader = AnnotationConfigContextLoader.class)
@MyJavaContextConfig()
@ActiveProfiles(profiles = "p1")
public class DefaultJavaConfTest {
    @Autowired
    Compo1 myCompo1;
    @Autowired
    Compo2 myCompo2;
    @Autowired
    B2 b2;
    @Test
    public void testAllBeans(){
        String r1 = myCompo1.getId();
        String r2 = myCompo1.getB1Arg().getStr();
        String r3 = myCompo1.getB2Arg().getStr();
        String r4 = myCompo2.getId();
        System.out.println(r1+" "+r2+" "+r3+" "+r4);
    }

    /**
     * *******************************
     * Created by Irina.Petrovskaya on 9/4/2015.
     * Project: TF_test
     * *******************************
     */
    @ComponentScan("mytests.spring42.testingFrameworkSupport.components")
    @Configuration
    public static class ContextConfiguration {
        @Bean
        B1 b1(){
            return new B1();
        }

        @Bean
        B2 b2() {
            return new B2();
        }
    }
}
