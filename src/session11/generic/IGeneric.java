package session11.generic;

import java.util.List;

public interface IGeneric <T,E>{
    List<T> getAll();
    boolean delete(E e);
}
