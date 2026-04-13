package za.ac.cput.service;

import za.ac.cput.domain.Employee;
import za.ac.cput.repository.EmployeeRepository;
import za.ac.cput.repository.IEmployeeRepository;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService implements IEmployeeService{

    private static IEmployeeService service;
    private  IEmployeeRepository repository;

        //SINGLETON Till line 27
    //Initialize repository
    private EmployeeService() {
       repository = EmployeeRepository.getRepository();
    }

    // getInstance() guard method, to check if you did not create more than 1 object
    public static IEmployeeService getService() {
        if (service == null) {
            service = new EmployeeService();
        }
        return service;
    }


    @Override
    public Employee create(Employee employee) {
        return this.repository.create(employee);    //take employee object and let repository layer put it in the database using the create method.
    }

    @Override
    public Employee read(String id) {
        return this.repository.read(id);
    }

    @Override
    public Employee update(Employee employee) {
        return this.repository.update(employee);
    }
    @Override
    public List<Employee> getAll() {
        return this.repository.getAll();
    }
    //could add more customized methods
}
