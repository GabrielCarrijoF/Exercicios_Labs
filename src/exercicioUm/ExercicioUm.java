package exercicioUm;

public class ExercicioUm {

  public static void main(String[] args) {

    int A = 10;
    int B = 20;
    int C;

    System.out.println("Antes das Atribuições");
    System.out.println("Variavel A = " + A);
    System.out.println("Variavel B = " + B);
    System.out.println();

    C = A;
    A = B;
    B = C;

    System.out.println("Depois das Atribuições");
    System.out.println("Variavel A = " + A);
    System.out.println("Variavel B = " + B);
  }
}
