public class App {
    public static void main(String[] args) throws Exception {
        int A = 10;
        int B = 35;

        int C = A;

        A = B;
        B = C;

        System.out.println(A);
        System.out.println(B);
    }
}
