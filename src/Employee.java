import Interfaces.Payable;
public class Employee extends Person{
    private String position;
    private double salary;
    public Employee(){
        super();
    }
    //Parametrized constructor that sets name, surname, position, salary
    public Employee(String name, String surname, String position, double salary){
        this();
        setName(name);
        setSurname(surname);
        setPosition(position);
        setSalary(salary);
    }
    //Getters and setters
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String getPosition(){
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    @Override
    public String toString() {
        return "Employee: " + super.toString();
    } //toString method that outputs information about Employee

    //Overrides getPaymentAmount method from Person class and retrieves employee's salary
    @Override
    public double getPaymentAmount() {
        return getSalary();
    }
}
