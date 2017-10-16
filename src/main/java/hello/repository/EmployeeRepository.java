package hello.repository;

import hello.domain.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, String> {
    List<Employee> findAll();

    Employee save(Employee employee);

    void delete(String id);
}
