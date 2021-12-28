package exercicioCinco;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioCinco {

  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int quantidadeAtualEmEstoque, quantidadeMaximaEmEstoque, quantidadeMinimaEmEstoque, quantidadeMedia;

    System.out.print("Quantidade ATUAL em estoque: ");
    quantidadeAtualEmEstoque = sc.nextInt();
    System.out.print("Quantidade MAXIMA em estoque: ");
    quantidadeMaximaEmEstoque = sc.nextInt();
    System.out.print("Quantidade MINIMA em estoque: ");
    quantidadeMinimaEmEstoque = sc.nextInt();

    quantidadeMedia = (quantidadeMaximaEmEstoque + quantidadeMinimaEmEstoque) / 2;

    if (quantidadeAtualEmEstoque <= quantidadeMedia) {
      System.out.println("Não Efetuar A Compra");
    } else {
      System.out.println("Efetuar Compra");
    }
  }
}
