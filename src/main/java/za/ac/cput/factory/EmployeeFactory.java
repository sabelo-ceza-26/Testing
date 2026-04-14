package za.ac.cput.factory;

import za.ac.cput.Util.Helper;
import za.ac.cput.domain.Employee;

import java.time.LocalDate;


public class EmployeeFactory {
    public static Employee createEmployee(String employeeNum, String firstName, String lastName, String
                                          email, double salary, LocalDate dateOfBirth){
        if (Helper.isNullOrEmpty(employeeNum) ||
                Helper.isNullOrEmpty(firstName) ||
                Helper.isNullOrEmpty(lastName) ||
                Helper.isNullOrEmpty(email))
        {
            return null;
        }
        if(!Helper.isValidEmail(email)){
            return null;
        }
        if (salary <= 0) {

            return null;

        }
        return new Employee.Builder()
                .setEmployeeNum(employeeNum)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(email)
                .setSalary(salary)
                .setDateOfBirth(dateOfBirth)
                .build();


    }
    public static Employee createEmployee(String employeeNum, String firstName, String lastName){
        if(Helper.isNullOrEmpty(employeeNum)
        || Helper.isNullOrEmpty(firstName)
        || Helper.isNullOrEmpty(lastName)){
            return null;
        }
        return new Employee.Builder()
                .setEmployeeNum(employeeNum)
                .setFirstName(firstName)
                .setLastName(lastName)
                .build();
    }

}
