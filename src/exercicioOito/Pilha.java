package exercicioOito;

public class Pilha {

  int estrutura[];
  int controleTopo;

    public Pilha() {
    estrutura = new int[10];
    controleTopo = -1;
  }

  public void push(int e) {
    if (isFull()) {
      throw new RuntimeException("Stack Overflow");
    }
    controleTopo++;
    estrutura[controleTopo] = e;
  }

  public int pop() {
    if (isEmpty()) {
      throw new RuntimeException("Empty Stack");
    }
    int e;
    e = estrutura[controleTopo];
    controleTopo--;
    return e;
  }

  public boolean isEmpty() {
    return (controleTopo == -1);
  }

  public boolean isFull() {
    return (controleTopo == estrutura.length -1);
  }

  public int get() {
    if (isEmpty()) {
      throw new RuntimeException("Empty Stack");
    }
    return estrutura[controleTopo];
  }
}
