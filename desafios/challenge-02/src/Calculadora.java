public class Calculadora {

    public void algoritmo(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " Eh um numero par");
        } else {
            System.out.println(number + " Eh um numero impar");
        }

        if (number < 0) {
            System.out.println(number + " Eh um numero negativo");
        } else {
            System.out.println(number + " Eh um numero positivo");
        }
    }

}
