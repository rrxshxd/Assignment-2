import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static void main(String[] args){
        ArrayList<Person> peopleList = new ArrayList<>();

        peopleList.add(new Employee("Anton","Antonov", "Manager", 95045.98));
        peopleList.add(new Student("Rashad","Gajiyev",2.68));
        peopleList.add(new Student("Magomed","Magomedov",2.33));
        peopleList.add(new Employee("Vasiliy","Ivanov","Engineer",120250.25));
        peopleList.add(new Employee("Daniil","Nikitin","Builder",115000.00));
        peopleList.add(new Employee("Oleg","Krivoi","Taxi-driver",75254.87));

        Collections.sort(peopleList);
        printData(peopleList);
    }

    public static void printData(Iterable<Person> people){
        for(Person person : people){
            System.out.println(person.toString());
        }
    }
}
