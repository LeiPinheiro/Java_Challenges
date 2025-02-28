public class Calculator {

    public double getSquare(double number) {
        return number * number;
    }

    public void imcCalculator(double peso, double altura) {

        double valueIMC = peso / getSquare(altura);

        if (valueIMC < 18.5) {
            System.out.println("Abaixo do peso!");
        } else if (valueIMC <= 24.9) {
            System.out.println("Peso ideal, parabens!");
        } else if (valueIMC <= 29.9) {
            System.out.println("Levemente acima do peso!");
        } else if (valueIMC <= 34.9) {
            System.out.println("Obesidade nivel 1");
        } else if (valueIMC <= 39.9) {
            System.out.println("Obesidade nivel 2 (severa)");
        } else if (valueIMC >= 40) {
            System.out.println("Obesidade nivel 3 (morbida)");
        }
    }
}
