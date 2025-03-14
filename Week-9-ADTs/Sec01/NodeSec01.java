public class NodeSec01<E>
{
    private E value;
    private NodeSec01 next;

    public NodeSec01(E value)
    {
        this.value = value;
        next = null;
    }

    public NodeSec01 getNext()
    {
        return next;
    }

    public void setNext(NodeSec01 newNode)
    {
        this.next = newNode;
    }
}
