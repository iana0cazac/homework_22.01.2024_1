import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        grad grad = new grad();

        System.out.println("Introduce the number: ");
        grad.gradCelsius = scanner.nextInt();
        System.out.println("Grad Celsius, which must converted to Fahrenheit: " + grad.gradCelsius);

        double gradFahrenheit = 33.8 * grad.gradCelsius;
        System.out.println("Result in Fahrenheit: " + gradFahrenheit);
    }
}