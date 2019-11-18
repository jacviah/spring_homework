package by.jacviah.spring.task1;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestCase {

        @Test
        void getContext() {
            final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/resources/beans.xml");
            Dao dao = (Dao) context.getBean("dao");
            assertTrue(dao.execute());
        }
}
