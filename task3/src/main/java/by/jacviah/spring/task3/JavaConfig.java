package by.jacviah.spring.task3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

    @Bean("dao")
    public Dao dao() {
        return new DaoImpl();
    }
}
