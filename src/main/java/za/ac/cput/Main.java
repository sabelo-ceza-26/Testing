package za.ac.cput;

import za.ac.cput.factory.EmployeeFactory;
import za.ac.cput.domain.Employee;


public class Main {
    public static void main(String[] args) {
         Employee emp = EmployeeFactory.createEmployee("25452",
                 "Sabie","Ceza",
                 "", 50000.00f);

        System.out.println(emp);
        }
    }
