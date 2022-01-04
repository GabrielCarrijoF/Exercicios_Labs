package exercicioNove;

public class ExercicioNove extends Fila {

  public static void main(String[] args) {

    Fila ordem = new Fila();

    ordem.insert(1);
    ordem.insert(2);
    ordem.insert(3);
    ordem.insert(4);
    ordem.insert(5);
    ordem.insert(6);
    ordem.insert(7);
    ordem.insert(8);
    ordem.insert(9);
    ordem.insert(10);
    ordem.insert(11);
    ordem.insert(12);
    ordem.insert(13);
    ordem.insert(14);
    ordem.insert(15);
    ordem.insert(16);
    ordem.insert(17);
    ordem.insert(18);
    ordem.insert(19);
    ordem.insert(20);
    System.out.println(ordem.get());
    ordem.insert(21);

    while (!ordem.isEmpty()) {
      int elemento = ordem.get();
      System.out.println("Estrutura da Pilha: " + elemento);
    }

  }
}
