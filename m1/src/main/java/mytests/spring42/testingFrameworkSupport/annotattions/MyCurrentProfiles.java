package mytests.spring42.testingFrameworkSupport.annotattions;

import org.springframework.core.annotation.AliasFor;
import org.springframework.test.context.ActiveProfiles;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 9/4/2015.
 * Project: TF_test
 * *******************************
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@ActiveProfiles
public @interface MyCurrentProfiles {
    @AliasFor(annotation = ActiveProfiles.class, attribute = "profiles")
    String[] activeProfiles() default {};
}
