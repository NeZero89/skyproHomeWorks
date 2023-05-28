package Skypro.skyproHomeWorks.controller;

import Skypro.skyproHomeWorks.Employee;
import Skypro.skyproHomeWorks.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collection;

@RestController
@RequestMapping("/employee")

public class EmployeeController {
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;

    }

    private final Skypro.skyproHomeWorks.service.EmployeeService employeeService;



    @GetMapping("/add")
    public Employee add(@RequestParam String firstName, @RequestParam String lastName){
        return employeeService.add(firstName, lastName);

    }
    @GetMapping("/remove")
    public Employee remove(@RequestParam String firstName, @RequestParam String lastName){
        return employeeService.remove(firstName, lastName);
    }
    @GetMapping("/fiund")
    public Employee find(@RequestParam String firstName, @RequestParam String lastName){
        return employeeService.find(firstName, lastName);

    }
    @GetMapping()
    public Collection<Employee> findAll(){
        return employeeService.findAll();

    }

}
