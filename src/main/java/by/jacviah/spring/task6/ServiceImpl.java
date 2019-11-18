package by.jacviah.spring.task6;

public class ServiceImpl implements Service {

    private Dao dao;

    public ServiceImpl(Dao dao) {
        this.dao = dao;
    }

    @Override
    public boolean execute() {
        return dao.execute();
    }
}
