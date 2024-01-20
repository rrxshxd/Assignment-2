public class Student extends Person{
    private double gpa;
    public Student(){
        super();
    }
    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public Student(String name, String surname, String position, double gpa){
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
        return getPosition() + super.toString();
    }
}
