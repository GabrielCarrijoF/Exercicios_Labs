package exercicioDez.listaDuplamenteEncadeada;

public class Main extends Node {

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
    String salvarinformacao = inicio.info; // salva a informação
    inicio = inicio.proximo; // inicio é igual a inicio.proximo
    if (inicio != null) { //inicio é diferente de nulo
      inicio.anterior = null;
    } else {
      fim = null;
    }
    tamanho--;
    return salvarinformacao;
  }

  public void inserirFim(String info) {
    Node node = new Node();
    node.info = info; // salva informação
    node.proximo = null; // no. proximo igual a nulo
    node.anterior = fim;
    if (fim != null) {
      fim.proximo = node; // faz a ligação entre proximo nó e o final
    }
    fim = node; //atribiu informação no final
    if (tamanho == 0) {
      inicio = fim;
    }
    tamanho++;
  }

  public String retirarFim() {
    if (fim == null) { // fim é igual a nulo
      return null;
    }
    String salvarInformacao = fim.info; // salva a informação do fim
    fim = fim.anterior; //fim é igual a fim.anterior para que possa excluir o nó
    if (fim != null) { // valida se o proximo nó é nulo
      fim.proximo = null;
    }
    tamanho--; // retira nó
    return salvarInformacao; // volta informação
  }
}
