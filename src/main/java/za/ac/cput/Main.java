package za.ac.cput;

import za.ac.cput.domain.Employee;


public class Main {
    public static void main(String[] args) {

//
//        Employee emp1 = new Employee("12564", "Christopher","Taliep");
//        Employee emp2 = new Employee("Marcus", "Lamola");
//
//        Employee emp3 = new Employee("2266584592");
//

        Employee emp = new Employee.Builder().setEmployeeNum("556485")
                        .setFirstName("Sabie")
                        .setLastName("Ceza")
                        .build();

        Employee emp2 = new Employee.Builder()
                .setFirstName("Sabie")
                .setLastName("Ceza")
                .build();


        System.out.println(emp2.toString());

        }
    }
