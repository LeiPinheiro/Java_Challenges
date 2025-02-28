public class CalcSalario {

    final double minSalary = 1293.20;

    public void calculator(double userSalary) {
        double valor = userSalary / minSalary;

        System.out.printf("O usuario ganha %.2f salarios minimos\n", valor);
    }
}
