package by.jacviah.spring.task2;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestCase {

    @Test
    void getContext() {
        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("by.jacviah.spring.task2");
        context.refresh();
        Dao dao = (Dao) context.getBean(DaoImpl.class);
        assertTrue(dao.execute());
    }
}