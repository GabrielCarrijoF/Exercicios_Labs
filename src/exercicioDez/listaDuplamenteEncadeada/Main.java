package exercicioDez.listaDuplamenteEncadeada;

public class Main extends Node{

  Node inicio;
  Node fim;
  int tamanho;

  public void inserirInicio(String info) {
    Node node = new Node(); // nó instanciado
    node.info = info; //nó recebe informação
    node.anterior = null; // nó anterior fica como nulo
    node.proximo = inicio; // seta um valor para o proximo no caso null

    if (inicio != null) { //se inicio for direfente de nulo
      inicio.anterior = node; // inicio recebe um valor e coloca no anterior
    }
    inicio = node; //inicio recebe valor

    if (tamanho == 0) {
      fim = inicio;
    }
    tamanho++; //incrementa um elemento
  }

  public String retirarInicio() {
    if (inicio == null) { // inicio é igual a nulo
      return null;
    }
    String salvarinformação = inicio.info; // salva a informação
    inicio = inicio.proximo; // inicio é igual a inicio.proximo
    if (inicio != null) { //inicio é diferente de nulo
      inicio.anterior = null;
    } else {
      fim = null;
    }
    tamanho--;
    return salvarinformação;
  }

  public void inserirFim(String info){
    Node node = new Node();
    node.info = info; // informação
    node.proximo = null;
    node.anterior = fim;
  }
}
