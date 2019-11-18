package by.jacviah.spring.task4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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
