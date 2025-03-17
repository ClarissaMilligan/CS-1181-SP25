public class LinkedListSec01<E>
{
    private NodeSec01<E> head = null;

    public LinkedListSec01(E headValue)
    {
        this.head = new NodeSec01<>(headValue);
    }

    public void add(E newValue)
    {
        NodeSec01<E> newNode = new NodeSec01<>(newValue);
        NodeSec01<E> currNode = head;

        while (currNode.getNext() != null)
        {
            currNode = currNode.getNext();
        }
        currNode.setNext(newNode);
    }

    public void insert(int index, E newValue)
    {
        NodeSec01<E> newNode = new NodeSec01<>(newValue);
        NodeSec01<E> curr = head;
        int i = 0;

        while (curr.getNext() != null && i < index - 1)
        {
            curr = curr.getNext();
            i++;
        }
        newNode.setNext(curr.getNext());
        curr.setNext(newNode);
    }

    public void replace(int index, E newValue)
    {
        NodeSec01<E> curr = head;
        int count = 0;

        while (curr.getNext() != null && count < index)
        {
            curr = curr.getNext();
            count++;
        }
        curr.setValue(newValue);
    }

    public E get(int index)
    {
        NodeSec01<E> curr = head;
        int count = 0;

        while (curr.getNext() != null && count < index)
        {
            curr = curr.getNext();
            count++;
        }
        return curr.getValue();
    }

    public String toString()
    {
        NodeSec01<E> curr = head;
        String output = "[" + curr.toString();

        while (curr.getNext() != null)
        {
            curr = curr.getNext();
            output = output + ", " + curr.toString();
        }

        return output + "]";
    }
}
