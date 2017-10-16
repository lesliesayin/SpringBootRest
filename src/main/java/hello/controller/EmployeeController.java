package hello.controller;

import hello.domain.Employee;
import hello.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("")
    public List<Employee> findAll() {
        return employeeService.findAll();
    }

    @PutMapping("")
    public void add(@RequestBody Employee employee) {
        employeeService.add(employee);
    }

    @PatchMapping("")
    public void update(@RequestBody Employee employee) {
        employeeService.update(employee);
    }

    @DeleteMapping("")
    public void delete(@RequestParam("id") String id) {
        employeeService.delete(id);
    }
}
