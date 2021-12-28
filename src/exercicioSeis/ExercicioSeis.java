package exercicioSeis;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioSeis {

  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner scanner = new Scanner(System.in);

    int valorA, valorB, valorC, soma = 0;

    System.out.println("Inforeme valor1");
    valorA = scanner.nextInt();

    System.out.println("Inforeme valor2");
    valorB = scanner.nextInt();

    System.out.println("Inforeme valor3");
    valorC = scanner.nextInt();

    if (valorA > valorB) {
      if (valorB > valorC) {
        soma = valorA + valorB;
      } else {
        soma = valorA + valorC;
      }
    } else if (valorB > valorA) {
      if (valorC > valorA) {
        soma = valorB + valorC;
      } else {
        soma = valorA + valorB;
      }
    } else if (valorC > valorA) {
      if (valorA > valorB) {
        soma = valorC + valorA;
      } else {
        soma = valorC + valorB;
      }
    }
    System.out.print(soma);
    scanner.close();
  }
}

