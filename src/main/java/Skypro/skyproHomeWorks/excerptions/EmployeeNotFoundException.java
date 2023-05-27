package Skypro.skyproHomeWorks.excerptions;

import Skypro.skyproHomeWorks.Employee;
import Skypro.skyproHomeWorks.service.EmployeeServiceImpl;

public class EmployeeNotFoundException extends RuntimeException{
    public EmployeeNotFoundException(Employee employee){
        super("Сотрудник не найден: "+employee.toString());
    }
}
