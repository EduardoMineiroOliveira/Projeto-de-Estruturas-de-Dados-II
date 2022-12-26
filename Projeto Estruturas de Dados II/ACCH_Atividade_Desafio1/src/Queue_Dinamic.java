
public class Queue_Dinamic implements TAD_Queue {
    private Node head = null;
    private Node tail = null;

    public Queue_Dinamic() {
        head = null;
        tail = null;
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    @Override
    public boolean isEmpty() {
        if (head == null) return true;
        else return false;
    }

    
    
    
    
    
    
    
    
    @Override
    public boolean isFull() {
        throw new UnsupportedOperationException("Not Supported Yet.");
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    @Override
    public Object enqueue(Object x) {
        if (x == null) {
            return null;
        }
        try {
            Node novo = new Node();
            novo.setValor(x);
            novo.setNext(null);
            if (tail == null) {
                head = novo;
                tail = novo;
            } else {
                tail.setNext(novo);
                tail = novo;
            }
            return x;
        } catch (Exception ex) {
            return null;
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    @Override
    public Object dequeue() {
        if (head == null) {
            return null;
        }
        Object value = head.getValor();
        head = head.getProximo();
        if (head == null) {
            tail = null;
        }
        return value;
    }

    @Override
    public Object peek() {
        if (head == null) return null;
        else return head.getValor();
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public String toString() {
        if (!isEmpty()) {
            String saida = "";
            Node aux = head;
            while (aux != null) {
                saida += ", ";
            }
            return ("f:[" + saida + "]");
        } else {
            return ("f:[ ]");
        }
    }
}



