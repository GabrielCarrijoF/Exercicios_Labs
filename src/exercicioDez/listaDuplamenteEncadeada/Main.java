package exercicioDez.listaDuplamenteEncadeada;

public class Main extends ListaDupla {

  public static void main(String[] args) {

    ListaDupla listaDupla = new ListaDupla();

    System.out.println("Inicio testes");
    System.out.println(listaDupla);
    for (int i = 0; i < 6; i++ ){
      listaDupla.inserirInicio("" + (char) (i+97));
      System.out.println(listaDupla);
    }

    listaDupla.inserirMeio(1,"z");
    System.out.println(listaDupla);

    System.out.println("retirei: "+ listaDupla.retirarMeio(4));
    System.out.println(listaDupla);

    while (listaDupla.retirarInicio() != null){
      System.out.println(listaDupla);
    }

    System.out.println();
    System.out.println();

    System.out.println("Fim testes");
    for (int i = 0; i < 6; i++ ){
      listaDupla.inserirFim("" + (char) (i+97));
      System.out.println(listaDupla);
    }

    listaDupla.inserirMeio(1,"z");
    System.out.println(listaDupla);

    System.out.println("retirei: "+ listaDupla.retirarMeio(4));
    System.out.println(listaDupla);

    while (listaDupla.retirarFim() != null){
      System.out.println(listaDupla);
    }
  }
}
