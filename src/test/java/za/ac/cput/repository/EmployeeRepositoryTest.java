package za.ac.cput.repository;

import org.junit.jupiter.api.*;
import za.ac.cput.Factory.EmployeeFactory;
import za.ac.cput.domain.Employee;


import static org.junit.jupiter.api.Assertions.*;

//AlphanumericOrder
@TestMethodOrder(MethodOrderer.MethodName.class)
class EmployeeRepositoryTest {
    private static IEmployeeRepository repository = EmployeeRepository.getRepository();     //Enforce singleton

    private Employee employee = EmployeeFactory.createEmployee("" +
            "22009484","Sabelo", "Ceza");


    @Test
    void a_create() {
        Employee created = repository.create(employee);
        assertNotNull(created);
        System.out.println(created.toString());
    }

    @Test
    void b_read() {
        Employee read = repository.read(employee.getEmployeeNum());
        assertNotNull(read);
        System.out.println(read.toString());
    }

    @Test
    void c_update() {
        Employee newEmployee = new Employee.Builder().copy(employee).setFirstName("Lilitha")
                .build();
        Employee updated = repository.update(newEmployee);
        assertNotNull(updated);
        System.out.println(updated.toString());
    }

    @Test
    @Disabled
    void d_delete() {
        assertTrue(repository.delete(employee.getEmployeeNum()));
        System.out.println("Successfully deleted!!");
    }

    @Test

    void e_getAll() {
        System.out.println(repository.getAll());
    }
}