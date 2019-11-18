package by.jacviah.spring.task8;

import java.util.List;

public class ServiceImpl implements Service {

    private List<Dao> dao;

    public ServiceImpl(List<Dao> dao) {
        this.dao = dao;
    }

    public List<Dao> getDao() {
        return dao;
    }

    @Override
    public boolean execute() {
        for (Dao item: dao) {
            System.out.println(item.getClass().toString() + ".execute() is " + item.execute());
        }
        return true;
    }
}
