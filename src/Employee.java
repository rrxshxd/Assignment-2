public class Employee extends Person {
    public Employee(){
        super();
    }
    public Employee(String name, String surname){
        this();
        setName(name);
        setSurname(surname);
    }

    @Override
    public String getPosition() {
        return Position;
    }

    private String Position;
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setPosition(String position) {
        Position = position;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Position='" + Position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
