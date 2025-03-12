public class Node<E>
{
    private E value;
    private Node next = null;

    public Node(E value, Node next)
    {
        this.value = value;
        this.next = next;
    }

    public Node getNext()
    {
        return next;
    }

    public void setNext(Node newNext)
    {
        next = newNext;
    }
}
