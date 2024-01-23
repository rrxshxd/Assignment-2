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

    public Student(String name, String surname, double gpa){
        this();
        setName(name);
        setSurname(surname);
        setGpa(gpa);
    }
    @Override
    public String getPosition() {
        return "Student: ";
    }

    @Override
    public String toString() {
        return super.toString() + " " + "earns" + " " + getPaymentAmount();
    }

    @Override
    public double getPaymentAmount() {
        return(gpa > 2.67) ? scholarship : 0.00;
    }
}
