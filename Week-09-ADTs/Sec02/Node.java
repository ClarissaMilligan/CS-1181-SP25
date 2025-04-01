public class Node<E>
{
    private E value;
    private Node<E> next = null;

    public Node(E value, Node<E> next)
    {
        this.value = value;
        this.next = next;
    }

    public Node<E> getNext()
    {
        return next;
    }

    public void setNext(Node<E> newNext)
    {
        next = newNext;
    }

    public E getValue()
    {
        return value;
    }

    public void setValue(E newValue)
    {
        value = newValue;
    }

    public String toString()
    {
        return value.toString();
    }
}
