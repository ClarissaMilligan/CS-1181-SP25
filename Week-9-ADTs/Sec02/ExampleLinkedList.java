import java.util.Stack;

public class ExampleLinkedList
{
    public static void main(String[] args)
    {
        LinkedList<String> l = new LinkedList<>("hey");

        l.add("hi");
        l.add("hello");
        System.out.println(l);

        System.out.println(l.get(2));
        l.replace(1, "bye!");
        System.out.println(l);

        l.insert(1, "this is a test");
        System.out.println(l);
    }
}
