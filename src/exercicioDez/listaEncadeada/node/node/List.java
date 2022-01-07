package exercicioDez.listaEncadeada.node.node;

import exercicioDez.listaEncadeada.node.node.Node;

public class List {

  private Node head;

  public void add(Double value) {
    Node node = new Node();
    node.setValue(value);
    node.setNext(head);
    head = node;
  }

  @Override
  public String toString() {
    StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append("[");

    Node p = head;
    while (p != null) {
      stringBuffer.append(p.getValue() + " ");
      p = p.getNext();
    }

    stringBuffer.append("]");
    return stringBuffer.toString();
  }
}
