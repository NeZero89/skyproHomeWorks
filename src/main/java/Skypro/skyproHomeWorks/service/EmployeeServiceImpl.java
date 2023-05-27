package Skypro.skyproHomeWorks.service;

import Skypro.skyproHomeWorks.Employee;
import Skypro.skyproHomeWorks.excerptions.EmployeeAvailableException;
import Skypro.skyproHomeWorks.excerptions.EmployeeNotFoundException;
import Skypro.skyproHomeWorks.excerptions.EmployeeStorageListFullException;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
@Service
public class EmployeeServiceImpl implements EmployeeService{
private static final int EMPLOYESS_MAX_CONT = 5;
    private final Set<Employee> employees;

    public EmployeeServiceImpl() {
        this.employees = new HashSet<>();
    }

    @Override
    public Employee add(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if (employees.contains(employee)) {
            throw new EmployeeAvailableException(employee);
        }
        if (employees.size()==EMPLOYESS_MAX_CONT){
            throw new EmployeeStorageListFullException();
        }
employees.add(employee);
        return employee;
    }

    @Override
    public Employee remove(String firstName, String lastName) {
        Employee employee=new Employee(firstName,lastName);
        if (!employees.contains(employee)) {
            throw new EmployeeNotFoundException(employee);
        }
            employees.remove(employee);

        return employee;
    }

    @Override
    public Employee find(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if (!employees.contains(employee)) {
            throw new EmployeeNotFoundException(employee);

        }
        return employee;
    }
    @Override
    public Collection<Employee> findAll() {
        return employees;

    }
}
