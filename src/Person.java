public class Person {
    private String firstName;
    private String lastName;
    private String pesel;
    private int age;

    public Person(String firstName, String lastName, String pesel, int age) throws NameUndefinedException, IncorrectAgeException {
        if (firstName.length() < 2 || lastName.length() < 2 || firstName.equals("null") || lastName.equals("null")) {
            throw new NameUndefinedException();
        }
        if (age < 1) {
            throw new IncorrectAgeException();
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", pesel='" + pesel + '\'' +
                ", age=" + age +
                '}';
    }
}
