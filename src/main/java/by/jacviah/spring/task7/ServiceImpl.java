package by.jacviah.spring.task7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class ServiceImpl implements Service {

    private Dao firstDao;
    private Dao secondDao;

    @Autowired
    public void setDao(@Qualifier("dao2")Dao dao2, @Qualifier("dao1")Dao dao1) {
        this.firstDao = dao1;
        this.secondDao = dao2;
    }

    @Override
    public boolean execute() {
        return secondDao.execute();
    }
}
