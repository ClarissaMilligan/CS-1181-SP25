import java.util.*;

public class SetsMaps
{
    public static void main(String[] args)
    {
        // testing out various duplicates in a HashSet
        Set<Thing> s1 = new HashSet<>();
        s1.add(new Thing(2, "a"));
        s1.add(new Thing(2, "a"));

        Thing stuff = new Thing(2, "a");
        s1.add(stuff);
        s1.add(stuff);

        System.out.println("HashSet\n-------");
        System.out.println(s1);

        // another HashSet example
        HashSet<String> s2 = new HashSet<>();
        s2.add("a");
        s2.add("a");
        System.out.println(s2);

        // testing out duplicates in a TreeSet
        TreeSet<Thing> ts = new TreeSet<>();
        ts.add(new Thing(1, "a"));
        ts.add(new Thing(1, "a"));
        System.out.println("\n\nTreeSet\n-------");
        System.out.println(ts);


        // testing out duplicate keys in a HashMap
        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("Clarissa", 5);
        map1.put("Clarissa", 7);
        System.out.println("\n\nHashMap\n-------");
        System.out.println(map1);

        // testing out duplicate keys in a TreeMap
        TreeMap<String, Integer> map2 = new TreeMap<>();
        map2.put("Clarissa", 5);
        map2.put("Clarissa", 10);
        System.out.println("\n\nTreeMap\n-------");
        System.out.println(map2);
    }
}
