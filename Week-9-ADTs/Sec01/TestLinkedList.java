public class TestLinkedList
{
    public static void main(String[] args)
    {
        LinkedListSec01<String> l = new LinkedListSec01<>("hey");

        l.add("hi");
        l.add("hello");
        System.out.println(l);

        System.out.println(l.get(2));
        l.replace(1, "bye!");
        System.out.println(l);

        l.insert(1, "goodbye");
        System.out.println(l);
    }
}
