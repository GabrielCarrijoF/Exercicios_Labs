package exercicioSete;

import java.util.Scanner;

public class ExercicoSete {

  private static void print(int[] chars) {
    System.out.printf("%d %d %d %d %d\n", chars[0], chars[1], chars[2], chars[3], chars[4]);
  }

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int valores = 5;
    int lista[] = new int[valores];
    int aux;


    for (int index = 0; index < valores; index++) {
      System.out.printf("Informe %2d. valor de %d: ", (index + 1), valores);
      lista[index] = scanner.nextInt();
    }

    for (int i = 0; i < lista.length; i++) {
      for (int j = 0; j < lista.length -i - 1; j++) {
        if (lista[j] > lista[j + 1]) {
          aux = lista[j];
          lista[j] = lista[j + 1];
          lista[j + 1] = aux;
          print(lista);
        }
      }
    }
    int print = 0;
    while (print < lista.length) {
      System.out.println(lista[print] + ",");
      print++;
    }
    scanner.close();
  }
}
