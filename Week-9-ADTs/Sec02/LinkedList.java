public class LinkedList<E>
{
    private Node head = null;

    public LinkedList(E headValue)
    {
        this.head = new Node(headValue, null);
    }

    public void add(E newValue)
    {
        Node newNode = new Node(newValue, null);
        Node curr = head;

        while (curr.getNext() != null)
        {
            curr = curr.getNext();
        }
        curr.setNext(newNode);
    }
}
