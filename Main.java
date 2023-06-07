import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double limite;
        System.out.println("Digite o limite do cartão:");
        limite = entrada.nextDouble();
        CartaoDeCredito cartao = new CartaoDeCredito(limite);

        int contador = 1;

        while(contador != 0) {
            System.out.println("Qual o item:");
            String item = entrada.next();
            System.out.println("Qual o valor:");
            double preco = entrada.nextDouble();
            Compras compra = new Compras(item, preco);
            boolean tentativaDeCompra = cartao.tentativaCompra(compra);
            //System.out.println(cartao.getCompras()); como pegar a lista

            if(tentativaDeCompra){
                System.out.println("compra realizada");
                System.out.println(cartao.getCompras());
                System.out.println("");
                System.out.println("digite 1 para comprar mais e 0 para sair:");
                contador = entrada.nextInt();
            }else{
                System.out.println("Saldo insuficiente!");
                contador = 0;
            }
        }
    Collections.sort(cartao.getCompras());
        for (Compras c : cartao.getCompras()) {
            System.out.println(c.getItem() + " - " +c.getValor());
        }
        System.out.println("\nSaldo do cartão: " +cartao.getSaldo());    
    }
}