public class LinkedListSec01<E>
{
    private NodeSec01 head = null;

    public LinkedListSec01(E headValue)
    {
        this.head = new NodeSec01(headValue);
    }

    public void add(E newValue)
    {
        NodeSec01 newNode = new NodeSec01(newValue);
        NodeSec01 currNode = head;

        while (currNode.getNext() != null)
        {
            currNode = currNode.getNext();
        }

        currNode.setNext(newNode);
    }
}
