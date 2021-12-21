package exercicioDois;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioDois {

  public static void main(String[] args) {


    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("Informe sua idade ( somente em anos! ) ");
    int anos = sc.nextInt();

    System.out.println("Informe sua idade ( somente em meses! ) ");
    int meses = sc.nextInt();

    System.out.println("Informe sua idade ( somente em dias! ) ");
    int dias = sc.nextInt();

     dias = (dias + (anos * 365) + (meses * 30));

    System.out.print("Sua Idade em dias é: " + dias);

    sc.close();
  }
}