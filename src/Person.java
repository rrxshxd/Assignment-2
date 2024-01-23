import Interfaces.Payable;
public abstract class Person implements Payable, Comparable<Person> {
    private static int id_gen = 1;
    private int id;
    private String name;
    private String surname;
    public Person(){
        id = id_gen++;
    }
    //Parametrized constructor that sets name and surname
    public Person(String name, String surname){
        this();
        setName(name);
        setSurname(surname);
    }
    //Down in the code I provided getters and setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    public abstract String getPosition(); //
    //toString method that returns formatted string presentation of the person
    @Override
    public String toString() {
        return id +
                "." + name + " " + surname;
    }
    //default method that returns 0.00, can be overrided by subclasses
    public double getPaymentAmount(){
        return 0.00;
    }
    //Comparable method that compares persons based on their payment amount
    @Override
    public int compareTo(Person otherPerson) {
        return Double.compare(this.getPaymentAmount(),otherPerson.getPaymentAmount());
    }
}