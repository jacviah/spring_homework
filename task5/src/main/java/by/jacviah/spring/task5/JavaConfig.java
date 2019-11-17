package by.jacviah.spring.task5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.core.annotation.Order;

@Configuration
public class JavaConfig {

    @Bean
    public Dao dao() {
        return new DaoImpl();
    }

    @Bean
    public Service service() {
        return new ServiceImpl();
    }

}
