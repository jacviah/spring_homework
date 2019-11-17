package by.jacviah.spring.task8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class JavaConfig {

    @Autowired
    private List<Dao> listOfDao;

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
        return new ServiceImpl(listOfDao);
    }
}
