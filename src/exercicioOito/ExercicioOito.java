package exercicioOito;

public class ExercicioOito extends Pilha {

  public static void main(String[] args) {

    Pilha ordem = new Pilha();

    ordem.push(5);
    ordem.push(4);
    ordem.push(3);
    ordem.push(2);
    ordem.push(1);

    while (!ordem.isEmpty()) {
      int elemento = ordem.pop();
      System.out.println("Estrutura da Pilha: " + elemento);
    }
  }
}