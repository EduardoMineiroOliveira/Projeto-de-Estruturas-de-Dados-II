
public class Node {

    private Object valor;
    private Node previa, proximo;

    public Object getValor() {
        return valor;
    }

    public void setValor(Object valor) {
        this.valor = valor;
    }

    public Node getProximo() {
        return proximo;
    }

    public void setNext(Object o) {
        this.proximo = proximo;
    }

    public <E> void getValue(E novo) {
    }
}
