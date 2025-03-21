package com.example.cruddemo;

import com.example.cruddemo.dao.EmployeeDao;
import com.example.cruddemo.entity.Employee;
import com.example.cruddemo.service.EmployeeService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
    private EmployeeService employeeService;

    @Autowired
    public EmployeeRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    @GetMapping("/employees")
    public List<Employee> findAllEmployees() {
        return employeeService.findAll();
    }

    @GetMapping("/employees/{findbyid}")
    public Employee findEmployeeById(@PathVariable Integer findbyid ) {
        return employeeService.findById(findbyid);
    }



    @Transactional
    @PostMapping("/employees")
    public Employee createStudent(@RequestBody Employee emp){
          emp.setId(null);
          Employee emp1=employeeService.save(emp);
          return emp1;
    }


    @Transactional
    @PatchMapping("/employees{id}")
    public Employee updateStudent(@RequestBody Employee emp,@PathVariable Integer id){
        Employee emp1=employeeService.save(emp);
        return emp1;
    }


    @Transactional
    @DeleteMapping("/employees/{deleteById}")
    public void deleteById(@PathVariable Integer deleteById) {
        employeeService.deleteById(deleteById);
    }
    //have to implement patch -for put all tye object is created again....
}
