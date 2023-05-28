package Skypro.skyproHomeWorks.excerptions;

import Skypro.skyproHomeWorks.Employee;

public class EmployeeAvailableException extends RuntimeException{
    public EmployeeAvailableException(Employee employee){
        super("Сотрудник с этими данными уже существует"+employee.toString());
    }
}
