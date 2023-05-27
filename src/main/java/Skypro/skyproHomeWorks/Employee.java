package Skypro.skyproHomeWorks;

import java.util.Objects;

public class Employee { private String lastName;
    private String firstName;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(lastName, employee.lastName) && Objects.equals(firstName, employee.firstName);
    }

    @Override
    public int hashCode() {
        return Objects.hash( firstName,lastName);
    }

    public Employee(String firstName, String lastName) {
        this.lastName = lastName;
        this.firstName = firstName;



    }

    public String toString() {
        return " ФИО: " + firstName + " " + lastName  ;
    }

    public String getLastName() {
        return firstName;
    }

    public String getFirstName() {
        return lastName;
    }
}








