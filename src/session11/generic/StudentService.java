package session11.generic;

import java.util.List;

public class StudentService implements IGeneric<Student,Integer>{

    @Override
    public List<Student> getAll() {
        return null;
    }

    @Override
    public boolean delete(Integer integer) {
        return false;
    }
}
