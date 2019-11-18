package by.jacviah.spring.task4;

import org.springframework.beans.factory.annotation.Autowired;

public class ServiceImpl implements Service {

    @Autowired
    private Dao dao;

    @Override
    public boolean execute() {
        return dao.execute();
    }
}
