import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static void main(String[] args){
        //Creating an ArrayList in order to place examples of persons
        ArrayList<Person> peopleList = new ArrayList<>();

        peopleList.add(new Employee("Anton","Antonov", "Manager", 95045.98));
        peopleList.add(new Student("Rashad","Gajiyev",2.68));
        peopleList.add(new Student("Magomed","Magomedov",2.33));
        peopleList.add(new Employee("Vasiliy","Ivanov","Engineer",120250.25));
        peopleList.add(new Employee("Daniil","Nikitin","Builder",115000.00));
        peopleList.add(new Employee("Oleg","Krivoi","Taxi-driver",75254.87));

        Collections.sort(peopleList); //Sorts list based on the payment amount
        printData(peopleList); //Printing the data
    }
    //Method that hepls us iterate through list and print person data
    public static void printData(Iterable<Person> people){
        for(Person person : people){
            System.out.println(person.toString());
        }
    }
}
