public class Calculator {
    String itemName = "Bicicleta";
    double itemPrice = 670;

    public void pagamento(String formaDePagamento) {
        if (formaDePagamento == "A vista em dinheiro" || formaDePagamento == "A vista no Pix") {
            double desconto = itemPrice * 0.15;
            double preçoComDesconto = itemPrice - desconto;
            System.out.println("Voce ganhou 15% de desconto, sua compra foi de " + preçoComDesconto + " reais");
        } else if (formaDePagamento == "A vista no cartao") {
            double desconto = itemPrice * 0.10;
            double preçoComDesconto = itemPrice - desconto;
            System.out.println("Voce ganhou 10% de desconto, sua compra foi de " + preçoComDesconto + " reais");
        } else if (formaDePagamento == "Parcelado") {
            System.out.println("Voce comprou pelo preço padrão, sem juros");
        }
    }
}
