package by.jacviah.spring.task10;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

    @Bean("dao")
    public Dao dao() {
        return new DaoImpl();
    }

    @Bean
    public PostProcessor  postProcessor() {
        return new PostProcessor();
    }

}
