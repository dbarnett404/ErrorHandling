public class Main {
    public static void main(String[] args) {
        System.out.printf("Java Error Test Project\n");
        Register register = new Register();
        register.addPerson("John,Doe,18,jd123@sussex.ac.uk");
        register.addPerson("Jane,Smith,19,js125@sussex.ac.uk");
        register.addPerson("Alice,Johnson,20,aj345@sussex.ac.uk");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }
}