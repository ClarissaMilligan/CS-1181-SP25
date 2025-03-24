import java.util.ArrayList;
import java.util.Scanner;

public class Generics
{
    public static void main(String[] args)
    {
        // explains why we specify a data type when creating an ArrayList object
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


        BingoMachine<Number> bm1 = new BingoMachine<>(6);
        //BingoMachine<String> bm2 = new BingoMachine<>("4");
        bm1.add(56);
        bm1.add(5473);
        //System.out.println(bm1.pickItem());

        for (Number n : bm1)
        {
            System.out.println(n);
        }

        ArrayList<Number> nums = new ArrayList<>();
        nums.add(54);
        nums.add(-5);

        bm1.addAll(nums);
        System.out.println(bm1);

        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(432);
        ints.add(423);

        bm1.addAll(ints);
        System.out.println(bm1);

        bm1.addAllToOther(nums);
        System.out.println(nums);

        ArrayList<Object> objs = new ArrayList<>();

        bm1.addAllToOther(objs);
        System.out.println(objs);

        Integer[] intsArr = {2, 5, 6, 1, 7};
        Integer i = printArray(intsArr);
        //String s = printArray(intsArr);

        Generics.<Integer>doStuff(10);
    }

    public static <E> E printArray(E[] arr)
    {
        String result = "[";

        for (int i = 0; i < arr.length; i++)
        {
            if (i == arr.length - 1)
            {
                result += arr[i] + "]";
            }
            else
            {
                result += arr[i] + ", ";
            }
        }
        System.out.println(result);
        return arr[0];
    }

    public static <E> void doStuff(int num)
    {
        ArrayList<E> myList = new ArrayList<>(num);
        System.out.println(myList);
    }
}
