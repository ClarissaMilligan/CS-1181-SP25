public class NodeSec01<E>
{
    private E value;
    private NodeSec01<E> next;

    public NodeSec01(E value)
    {
        this.value = value;
        next = null;
    }

    public NodeSec01<E> getNext()
    {
        return next;
    }

    public void setNext(NodeSec01<E> newNode)
    {
        this.next = newNode;
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
