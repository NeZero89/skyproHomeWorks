package Skypro.skyproHomeWorks.excerptions;

import Skypro.skyproHomeWorks.Employee;

public class EmployeeStorageListFullException extends RuntimeException{
    public EmployeeStorageListFullException(){

        super("Привышено максимальное количество сотрудников ");
    }
}
