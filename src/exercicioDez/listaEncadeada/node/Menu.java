package exercicioDez.listaEncadeada.node;


import java.util.Scanner;
import exercicioDez.listaEncadeada.node.node.List;

public class Menu {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    List list = new List();
    
    int opicao;

    do {
      showMenu();
      opicao = sc.nextInt();

      switch (opicao) {
        case 1: {
          System.out.println("Digite um numero");
          double value = sc.nextDouble();
          list.add(value);
          break;
        }
        case 2: {
          System.out.println(list.toString());
          break;
        }
        case 3: {
          System.out.println("Fim do Programa");
          break;
        }
        default:
          System.out.println("Opção invalida");
      }
    } while (opicao != 3);

    sc.close();
  }

  public static void showMenu() {
    System.out.println("1- Inserir elemento na tabela");
    System.out.println("2- Mostrar lista");
    System.out.println("3- Sair");
  }
}
