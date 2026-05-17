package Exercicious;
import java.util.Scanner;
public class SistemaFrete {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Digite qual é a região(Sul/Sudeste/Nordeste/Norte/Centro-Oeste: ");
      String regiao = scanner.next().toLowerCase();
      System.out.print("Digite o peso do produto em Kg: ");
      double peso = scanner.nextDouble();
      System.out.print("Digite o valor do pedido: ");
      double valorpedido = scanner.nextDouble();
      double valorporkilo;
      double frete;
      double desconto=0;
      int prazo;
      double total;

      if(regiao.equals("sudeste")){
          valorporkilo=5;
          prazo=3;
      }else if(regiao.equals("nordeste")){
          valorporkilo=10;
          prazo=7;
      }else if(regiao.equals("sul")){
          valorporkilo=7;
          prazo=5;
      }else if(regiao.equals("norte")){
          valorporkilo=15;
          prazo=12;
      }else{
          valorporkilo=8;
          prazo=6;
      }

      frete = valorporkilo * peso;

      if (valorpedido > 300){
          desconto = frete * 20/100;
      }
        total = frete - desconto;
      System.out.println("Frete: R$" +frete);
      System.out.println("Desconto: R$" +desconto);
      System.out.println("Valor a pagar: "+total);
      System.out.println("Prazo de entrega: "+prazo);
    }
}
