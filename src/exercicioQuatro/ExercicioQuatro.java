package exercicioQuatro;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioQuatro {

  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    double notas = 0;

    System.out.println("Quantos alunos tem na sua sala ?");
    int alunos = sc.nextInt();

    for (var i = 1; i <= alunos; i++){
      System.out.println("Informe a nota do Aluno :" + i);
      double nota = sc.nextDouble();
      notas += nota;
    }

    System.out.println("Media: "+ notas / alunos);
    sc.close();
  }
}
