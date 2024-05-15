import java.util.ArrayList;

public class Register{
    private ArrayList<Person> people;
    public Register() {
        people = new ArrayList<Person>();
    }

    public void addPerson(String personData) {
        String[] data = personData.split(",");
        String firstName = data[0];
        String lastName = data[1];
        int age = Integer.parseInt(data[2]);
        String email = data[3];
        Person person = new Person(firstName, lastName, age, email);
        people.add(person);
    }

}