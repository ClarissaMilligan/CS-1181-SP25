import java.util.ArrayList;
import java.util.Scanner;

public class Generics
{
    public static void main(String[] args)
    {
        BingoMachine<Integer> bm1 = new BingoMachine<>(6);
        BingoMachine<String> bm2 = new BingoMachine<>("4");
        bm1.add(56);
        bm1.add(5473);
        System.out.println(bm1.pickItem());

        ArrayList<String> jsdk = new ArrayList<>();
        jsdk.add("string one");
        jsdk.add("string two");
        jsdk.add("string three");

        String str1 = new String("blah");

        ArrayList test = new ArrayList();
        test.add(new String("string one"));
        test.add(new String("string two"));
        test.add(new String("string three"));
        test.add(new Scanner(System.in));

        Object str = new String("blah");
        String.valueOf(str).charAt(0);

        for (String s : jsdk)
        {
            System.out.println(s.charAt(0));
        }

        for (Object s : test)
        {
            System.out.println(String.valueOf(s).charAt(0));
        }
    }
}
