package exercicioSeis;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioSeis {

  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner scanner = new Scanner(System.in);

    int valorA, valorB, valorC, soma;

    System.out.println("Inforeme um valor");
    valorA = scanner.nextInt();

    System.out.println("Inforeme outro valor");
    valorB = scanner.nextInt();

    System.out.println("Inforeme outro valor");
    valorC = scanner.nextInt();

    if (valorA > valorB & valorB < valorC) {
      soma = valorA + valorC;
    }
    if (valorB > valorA & valorB < valorC) {
      soma = valorB + valorC;
    } else {
      soma = valorC + valorB;
    }

    scanner.close();
  }
}
