package mytests.spring42.testingFrameworkSupport.annotattions;

import org.springframework.core.annotation.AliasFor;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.test.context.support.GenericXmlContextLoader;

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
@ContextConfiguration(loader = AnnotationConfigContextLoader.class)
public @interface MyJavaContextConfig {
    @AliasFor(annotation = ContextConfiguration.class, attribute = "classes")
    Class<?>[] configClasses() default {};
}
