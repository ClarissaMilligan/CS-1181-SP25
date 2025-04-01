import java.util.ArrayList;

public class GenericExample
{
    public static void main(String[] args)
    {
        BingoMachineSec02<Number> bm1 = new BingoMachineSec02<>(5);
        bm1.add(4);
        bm1.add(-6);

        for (Number n : bm1)
        {
            System.out.println(n);
        }

        ArrayList<Number> nums = new ArrayList<>();
        nums.add(4);
        nums.add(5);
        nums.add(12);

        ArrayList<Double> dubs = new ArrayList<>();
        dubs.add(5.2);
        dubs.add(2.4);
        dubs.add(24.6);

        bm1.addAll(nums);
        System.out.println("bm1 contents after adding nums: " + bm1);

        bm1.addAll(dubs);
        System.out.println("bm1 contents after adding dubs: " + bm1);

        ArrayList<Object> objs = new ArrayList<>();

        bm1.addToOtherList(nums);
        System.out.println("nums contents after adding bm1: " + nums);

        bm1.addToOtherList(objs);
        System.out.println("objs contents after adding bm1: " + objs);

        Integer[] ints = {3, 5, 1, 6};
        Double[] dobs = {3.2, 4.5, 1.7, 12.7};

        Integer i = GenericExample.<Integer>printArray(ints);
        Number blah = printArray(dobs);
     }

    public static <T> T printArray(T[] arr)
    {
        String toPrint = "[";

        for (int i = 0; i < arr.length; i++)
        {
            if (i == (arr.length - 1))
            {
                toPrint += arr[i] + "]";
            }
            else
            {
                toPrint += arr[i] + ", ";
            }
        }
        System.out.println(toPrint);

        return arr[0];
    }
}
