package by.jacviah.spring.task9;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.List;

@Configuration
@PropertySource("classpath:values.properties")
public class JavaConfig {
    private @Value("${value}") String value;

    @Bean("dao")
    public Dao dao() {
        return new DaoImpl(value);
    }
}
