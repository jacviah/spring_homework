package by.jacviah.spring.task10;

import org.springframework.stereotype.Repository;

@Repository
public class DaoImpl implements Dao {

    @Profiling
    @Override
    public boolean execute() {
        return true;
    }

    @Profiling
    @Override
    public boolean longExecute() {
        for (long i = -999999999; i<999999999; i++){
            double a = 999999999.99999999999999999999999999999999999999;
        }
        return true;
    }

    @Override
    public boolean execute2() {
        for (long i = -999999999; i<999999999; i++){
        }
        return true;
    }
}
