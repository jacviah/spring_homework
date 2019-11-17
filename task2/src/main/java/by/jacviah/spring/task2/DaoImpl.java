package by.jacviah.spring.task2;

import org.springframework.stereotype.Repository;

@Repository
public class DaoImpl implements Dao {
    @Override
    public boolean execute() {
        return true;
    }
}
