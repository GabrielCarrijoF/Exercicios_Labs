package exercicioSete;

import java.util.Scanner;

public class ExercicoSete {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int valores = 10;
    int lista[] = new int[valores];
    int aux;

    for (int index = 0; index < valores; index++) {
      System.out.printf("Informe %2d. valor de %d: ", (index + 1), valores);
      lista[index] = scanner.nextInt();
    }

    for (int i = 0; i < lista.length; i++) {
      for (int j = 0; j < lista.length - 1; j++) {
        if (lista[j] > lista[j + 1]) {
          aux = lista[j];
          lista[j] = lista[j + 1];
          lista[j + 1] = aux;
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
