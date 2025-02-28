public class Calculator {
    private String studentName;

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentName() {
        return this.studentName;
    }

    public void algorith(double A, double B, double C, double D) {
        double media = (A + B + C + D) / 4;

        if (media >= 7) {
            System.out.println("Aluno " + this.studentName + " aprovado");
        } else if (media < 6) {
            System.out.println("Aluno " + this.studentName + " reprovado");
        } else {
            System.out.println("Aluno " + this.studentName + " em recuperacao");
        }

    }
}
