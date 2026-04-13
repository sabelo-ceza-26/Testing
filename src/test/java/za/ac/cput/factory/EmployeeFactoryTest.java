package za.ac.cput.factory;


import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Employee;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class EmployeeFactoryTest {

    @Test
    void createEmployee(){
        Employee employee = EmployeeFactory.createEmployee("52222",
                "Sabie","Ceza","sabeloceza@gmail.com",50000.00f);

        assertNotNull(employee);
        System.out.println(employee);

    }


}