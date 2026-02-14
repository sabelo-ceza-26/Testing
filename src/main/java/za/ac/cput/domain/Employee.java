package za.ac.cput.domain;

public class Employee {
    private String employeeNum;
    private String firstName;
    private String lastName;


    private Employee() {
    }

    public Employee(Builder builder){   // Constructor that takes in a builder object
        this.employeeNum  = builder.employeeNum;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        //Builder object is passed and the employee is set - I have now created an employee object

    }

    public String getEmployeeNum() {
        return employeeNum;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeNum='" + employeeNum + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public static class Builder {    //inner class
        private String employeeNum;
        private String firstName;
        private String lastName;

        public Builder setEmployeeNum(String employeeNum) {
            this.employeeNum = employeeNum;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;

        }

        public Builder copy(Employee employee){
            this.employeeNum = employee.employeeNum;
            this.firstName = employee.firstName;
            this.lastName = employee.lastName;
            return this;
        }

        public Employee build(){
            return new Employee(this);
        }
    }
}