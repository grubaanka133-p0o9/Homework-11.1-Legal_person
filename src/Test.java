import java.util.InputMismatchException;

public class Test {
    public static void main(String[] args) {
        Builder builder = new Builder();
        try {
            Person person = builder.builder();
            System.out.println(person.toString());
        } catch (NameUndefinedException e) {
            System.err.println("Zła nazwa");
        } catch (IncorrectAgeException e) {
            System.err.println("Zły wiek");
        } catch (InputMismatchException e) {
            System.err.println("Podaj liczbę");
        }
    }
}
