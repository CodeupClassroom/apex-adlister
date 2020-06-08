package interfaces;

import models.Employee;

public interface Employees {
    // CRUD
    long insert(Employee employee);
    void update(long id);
    Employee read(long id);
    void delete(long id);
}
