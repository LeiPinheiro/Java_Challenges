import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();

        if (idade >= 18) {
            System.out.println(nome + " Voce eh maior de idade!");
        } else {
            System.out.println(nome + " Voce eh menor de idade");
        }

        scanner.close();
    }
}
