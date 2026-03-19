package za.ac.cput.repository;

import za.ac.cput.domain.Employee;

import java.util.ArrayList;
import java.util.List;


public class EmployeeRepository implements IEmployeeRepository {
    //Declaration
    private static IEmployeeRepository repository = null;
    private List<Employee> employeeList;


    //Set up singleton and make a constructor
    private EmployeeRepository() {
        //initial object
        employeeList = new ArrayList<Employee>();
    }

    // getInstance() guard method, to check if you did not create more than 1 object
    public static IEmployeeRepository getRepository() {
        if (repository == null) {
            repository = new EmployeeRepository();
        }
        return repository;
    }

    @Override
    public Employee create(Employee employee) {
        boolean success = employeeList.add(employee);
        if (success) {
            return employee;
        }
        return null;
    }

    //Linear search with for loop
    @Override
    public Employee read(String employeeNum) {
        for (Employee e : employeeList) {
            if (e.getEmployeeNum().equals(employeeNum))
                return e;
        }
        return null;
    }

    @Override
    public Employee update(Employee employee) {             //object is already in the list
        String employeeNum = employee.getEmployeeNum();
        Employee employeeOld = read(employeeNum);         //old object
        if (employeeOld == null) {        //test
            return null;        //object doesnt exist
        }
            //If old object does not exist in the list
            //delete it from the list
            boolean success = delete(employeeNum);
            if (success) {
                if (employeeList.add(employee))     //add new object
                    return employee;
            }
            return null;
        }

    @Override
    public boolean delete(String employeeNum) {
        Employee employeeToDelete = read(employeeNum);      //search what to delete
        if(employeeToDelete == null)
            return false;
        return(employeeList.remove(employeeToDelete));
    }
    @Override
    public List<Employee> getAll() {
        return employeeList;
    }
}
