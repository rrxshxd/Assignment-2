import Interfaces.Payable;
public class Student extends Person {
    private double gpa;
    private static final double scholarship = 36660.00;
    public Student(){
        super();
    }
    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    //Parametrized constructor that sets name, surname and GPA
    public Student(String name, String surname, double gpa){
        this();
        setName(name);
        setSurname(surname);
        setGpa(gpa);
    }
    //Overrides getPosition method and returns Student
    @Override
    public String getPosition() {
        return "Student: ";
    }
    //Overrides toString method and provides information about student
    @Override
    public String toString() {
        return super.toString() + " " + "earns" + " " + getPaymentAmount();
    }
    //Overrides getPayment method and checks if student got schoolarship based on the gpa
    @Override
    public double getPaymentAmount() {
        return(gpa > 2.67) ? scholarship : 0.00;
    }
}
