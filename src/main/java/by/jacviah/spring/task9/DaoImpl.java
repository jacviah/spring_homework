package by.jacviah.spring.task9;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class DaoImpl implements Dao {

    private String value;

    public DaoImpl(String value) {
        this.value = value;
    }

    @Override
    public boolean execute() {
        if (value.equals("property")) {
            return true;
        } else {
            return false;
        }
    }
}
