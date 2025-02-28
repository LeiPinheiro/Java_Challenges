public class SomaDeValores {

    public void resultado(int A, int B, int C) {
        System.out.println("Valor de A: " + A);
        System.out.println("Valor de B: " + B);
        System.out.println("Valor de C: " + C);

        if (A + B > C) {
            System.out.println("O valor de " + A + " + " + B + " eh maior que " + C);
        } else {
            System.out.println("O valor de A e B somados nao sao maiores que C");
        }
    }
}
