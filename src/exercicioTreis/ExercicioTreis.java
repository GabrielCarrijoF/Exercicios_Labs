package exercicioTreis;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioTreis {

  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int numero;
    
    do {
      System.out.println("Informe Um Numero");
      numero = sc.nextInt();

    } while (numero == 0);

    for (int i = 0; i <= numero; i++) {

      System.out.println(i);

    }
    sc.close();
  }
}


