package za.ac.cput.domain;


public class Employee {
    private String employeeNum;
    private String firstName;
    private String lastName;
    private String email;
    private double salary;
    //private Contact contact;



    private Employee() {
    }

    private Employee(Builder builder){   // Constructor that takes in a builder object
        this.employeeNum  = builder.employeeNum;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.salary = builder.salary;
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

    public String getEmail() {
        return email;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeNum='" + employeeNum + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static class Builder {    //inner class
        private String employeeNum;
        private String firstName;
        private String lastName;
        private String email;
        private double salary;


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

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setSalary(double salary) {
            this.salary = salary;
            return this;
        }

        public Builder copy(Employee employee){
            this.employeeNum = employee.employeeNum;
            this.firstName = employee.firstName;
            this.lastName = employee.lastName;
            this.email = employee.email;
            this.salary = employee.salary;
            return this;
        }

        public Employee build(){
            return new Employee(this);
        }
    }
}