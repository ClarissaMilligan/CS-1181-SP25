import java.util.*;

public class SetsMapsExample
{
    public static void main(String[] args)
    {
        Set<Integer> hs1 = new HashSet<>();
        hs1.add(3);
        hs1.add(7);
        hs1.add(3);
        System.out.println(hs1);

        Set<Item> hs2 = new HashSet<>();
        hs2.add(new Item(3, "a"));
        hs2.add(new Item(3, "a"));
        System.out.println(hs2);

        Set<Item> ts1 = new TreeSet<>();
        ts1.add(new Item(5, "b"));
        ts1.add(new Item(5, "b"));
        System.out.println(ts1);


        Map<Integer, Boolean> hm1 = new HashMap<>();
        hm1.put(4, true);
        hm1.put(4, false);
        System.out.println(hm1);

        Map<Item, Item> hm2 = new HashMap<>();
        hm2.put(new Item(4, "d"), new Item(2, "l"));
        hm2.put(new Item(4, "d"), new Item(2, "l"));
        System.out.println(hm2);

        Map<Item, Item> tm2 = new TreeMap<>();
        tm2.put(new Item(4, "d"), new Item(2, "l"));
        tm2.put(new Item(4, "d"), new Item(5, "e"));
        System.out.println(tm2);
    }
}
