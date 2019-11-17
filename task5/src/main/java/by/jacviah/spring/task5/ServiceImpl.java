package by.jacviah.spring.task5;

import org.springframework.beans.factory.annotation.Autowired;

public class ServiceImpl implements Service {

    private Dao dao;

    @Autowired
    public void setDao(Dao dao) {
        this.dao = dao;
    }

    @Override
    public boolean execute() {
        return dao.execute();
    }
}
