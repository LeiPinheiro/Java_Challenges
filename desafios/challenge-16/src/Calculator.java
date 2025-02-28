public class Calculator {
    void algorith(int fahrenheit) {
        double C = (5 * (fahrenheit - 32) / 9);
        System.out.println("Temperatura em fahrenheit: " + fahrenheit);
        System.out.println("Temperatura convertida para celsius: " + C);
    }
}
