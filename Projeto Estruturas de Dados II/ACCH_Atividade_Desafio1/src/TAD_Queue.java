
public interface TAD_Queue {
     public boolean isEmpty();
    public boolean isFull();

    public Object enqueue(Object x);

    public Object dequeue();

    public Object peek();

    @Override
    public String toString();
}

