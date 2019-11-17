package by.jacviah.spring.task7;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class TestCase {

    @Test
    void test() {
        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(by.jacviah.spring.task7.JavaConfig.class);
        context.refresh();
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        Service service = (Service) context.getBean(ServiceImpl.class);
        assertFalse(service.execute());
    }
}