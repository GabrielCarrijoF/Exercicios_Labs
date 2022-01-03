package exercicioOito;

public class ExercicioOito extends Pilha {

  public static void main(String[] args) {

    Pilha teste = new Pilha();

    teste.push(5);
    teste.push(4);
    teste.push(3);
    teste.push(2);
    teste.push(1);

    while (!teste.isEmpty()) {
      int elemento = teste.pop();
      System.out.println("Estrutura da Pilha: " + elemento);
    }
  }
}