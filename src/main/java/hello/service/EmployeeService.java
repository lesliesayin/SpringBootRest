package hello.service;

import hello.domain.Employee;
import hello.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    public void add(Employee employee){
        employeeRepository.save(employee);
    }

    public void update(Employee employee) {
       employeeRepository.save(employee);
    }

    public void delete(String id) {
        employeeRepository.delete(id);
    }
}
