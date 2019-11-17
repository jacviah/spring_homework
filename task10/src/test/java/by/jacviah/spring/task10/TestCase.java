package by.jacviah.spring.task10;

import by.jacviah.spring.task10.Dao;
import by.jacviah.spring.task10.JavaConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestCase {

    @Test
    void test() {
        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(JavaConfig.class);
        context.refresh();
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        Dao dao = (Dao) context.getBean("dao");
        assertTrue(dao.execute());
        assertTrue(dao.execute());
        assertTrue(dao.execute2());
        assertTrue(dao.longExecute());
        assertTrue(dao.execute());
        assertTrue(dao.longExecute());
    }
}