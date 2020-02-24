import java.util.Scanner;

public class Builder {
    public Person builder() throws NameUndefinedException, IncorrectAgeException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Imię: ");
        String firstName = scanner.nextLine();
        System.out.println("Nazwisko: ");
        String lastName = scanner.nextLine();
        System.out.println("Pesel: ");
        String pesel = scanner.nextLine();
        System.out.println("Wiek: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        return new Person(firstName, lastName, pesel, age);
    }
}
