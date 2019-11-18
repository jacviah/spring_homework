package by.jacviah.spring.task7;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

    @Bean("dao1")
    public Dao dao1() {
        return new DaoImpl();
    }

    @Bean("dao2")
    public Dao dao2() {
        return new DaoImpl2();
    }

    @Bean
    public Service service() {
        return new ServiceImpl();
    }
}
