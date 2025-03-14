public class LinkedList<E>
{
    private Node<E> head = null;

    public LinkedList(E headValue)
    {
        this.head = new Node<>(headValue, null);
    }

    public void add(E newValue)
    {
        Node<E> newNode = new Node<>(newValue, null);
        Node<E> curr = head;

        while (curr.getNext() != null)
        {
            curr = curr.getNext();
        }
        curr.setNext(newNode);
    }

    public void insert(int index, E newValue)
    {
        Node<E> newNode = new Node<>(newValue, null);
        Node<E> curr = head;
        int count = 0;

        while (curr.getNext() != null && count < index - 1)
        {
            curr = curr.getNext();
            count++;
        }
        newNode.setNext(curr.getNext());
        curr.setNext(newNode);
    }

    public void replace(int index, E newValue)
    {
        Node<E> curr = head;
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
        Node<E> curr = head;
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
        Node<E> curr = head;
        String output = "[" + curr.toString();

        while (curr.getNext() != null)
        {
            curr = curr.getNext();
            output = output + ", " + curr.toString();
        }

        return output + "]";
    }
}
