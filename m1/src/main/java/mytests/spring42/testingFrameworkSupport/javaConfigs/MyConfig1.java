package mytests.spring42.testingFrameworkSupport.javaConfigs;

import mytests.spring42.testingFrameworkSupport.beans.B1;
import mytests.spring42.testingFrameworkSupport.beans.B2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 9/4/2015.
 * Project: TF_test
 * *******************************
 */
@Configuration
@ComponentScan("mytests.spring42.testingFrameworkSupport.components")
public class MyConfig1 {
    @Bean
    B1 b1(){
        return new B1();
    }

    @Bean
    B2 b2() {
        return new B2();
    }
}
