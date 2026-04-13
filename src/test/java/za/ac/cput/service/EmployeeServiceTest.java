package za.ac.cput.service;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Employee;
import za.ac.cput.factory.EmployeeFactory;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
class EmployeeServiceTest {
    //Service Object
    private IEmployeeService service = EmployeeService.getService();
    private Employee employee = EmployeeFactory.createEmployee("" +
            "22009484","Sabelo", "Ceza");

    @Test
    void a_create() {
        Employee created = service.create(employee);
        assertNotNull(created);
        System.out.println(created);
    }

    @Test
    void b_read() {
        Employee read = service.read(employee.getEmployeeNum());
        assertNotNull(read);
        System.out.println(read);
    }

    @Test
    void c_update() {
        Employee newEmployee = new Employee.Builder().copy(employee)
                .setFirstName("Amahle")
                .setSalary(8000.00)
                        .build();
        Employee updated = service.update(newEmployee);
        assertNotNull(updated);
        System.out.println(updated);

    }

    @Test
    void d_getAll() {
        System.out.println(service.getAll());
    }
}