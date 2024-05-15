/**
 * The Person class represents a person with attributes such as first name, last name, age, and email.
 * It provides methods to check the validity of the name, age, and email, as well as getters and setters for each attribute.
 */
public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String email;

    // Constructor to create a Person object with the given first name, last name, age, and email
    public Person(String firstName, String lastName, int age, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
    }

    // Method to check if the given name is valid (only contains alphabetic characters)
    public boolean checkValidName(String name) {
        return name.matches("^[a-zA-Z]+$");
    }
    
    // Getters and setters for firstName, lastName, age, and email
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // method to check if the given age is valid (between 0 and 120) 
    public boolean checkValidAge(int age) {
        return age >= 0 && age <= 120;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // method to check if the given email is valid (contains @ and .)
    public boolean checkValidEmail(String email) {
        return email.matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$");
    }     

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // toString method to return the person's information
    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}