package exercicioNove;

public class Fila {

  private int[] dadosDaFila;
  private int primeiro;
  private int ultimo;

  public Fila() {
    this.dadosDaFila = new int[20];
    this.primeiro = 0;
    this.ultimo = 0;
  }

  public void insert(int elementos) {
    if (ultimo == dadosDaFila.length) {
      throw new IllegalStateException("A fila esta cheia");
    }
    dadosDaFila[ultimo] = elementos;
    ultimo++;
  }

  public int get() {
    if (primeiro >= dadosDaFila.length) {
      throw new IllegalStateException("A fila esta vazia");
    }
    final var value = dadosDaFila[0];

    for (int i = 0; i < ultimo-1; i++) {
      dadosDaFila[i] = dadosDaFila[i + 1];
    }
    dadosDaFila[--ultimo] = 0;
    return value;
  }


  public boolean isEmpty() {
    return ultimo == 0;
  }

  public boolean isFull() {
    return ultimo >= dadosDaFila.length - 1;
  }


}
