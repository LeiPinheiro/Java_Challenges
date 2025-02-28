public class Calculator {

    public void algorith(int A, int B, int C) {

        if (A + B > C && A + C > B && B + C > A) {
            if (A == B && B == C) {
                System.out.println("O triangulo eh Equilatero.");
            } else if (A == B || A == C || B == C) {
                System.out.println("O trinagulo eh Isosceles.");
            } else {
                System.out.println("O triangulo eh Escaleno.");
            }
        } else {
            System.out.println("Os lados não formam um triangulo valido.");
        }
    }
}
