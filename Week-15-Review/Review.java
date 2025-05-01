import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Review
{
    public static void main(String[] args)
    {
//        System.out.println(countHi("fdhjw"));
//        System.out.println(countHi("xxhixx"));
//        System.out.println(countHi("xhixhix"));

//        System.out.println(fib(1));
//        System.out.println(fib(2));
//        System.out.println(fib(8));

        List<Integer> nums = new ArrayList<> (Arrays.asList(3, 5, 1, -5, 8, 6, 2));
        System.out.println(mergeSort(nums));
        List<String> names = new ArrayList<> (Arrays.asList("bob", "tom", "jane", "katie"));
        System.out.println(mergeSort(names));
    }

    public static int countHi(String str)
    {
        if (str.length() < 2)
        {
            return 0;
        }
        else
        {
            if (str.substring(0, 2).equals("hi"))
            {
                return 1 + countHi(str.substring(2));
            }
            else
            {
                return countHi(str.substring(1));
            }
        }
    }

    public static int fib(int num)
    {
        if (num <= 1)
        {
            return num;
        }
        else
        {
            return fib(num - 1) + fib(num - 2);
        }
    }

    public static <E extends Comparable<E>> List<E> mergeSort(List<E> items)
    {
        if (items.size() <= 1)
        {
            return items;
        }
        else
        {
            int half = items.size() / 2;
            List<E> firstHalf = items.subList(0, half);
            List<E> secondHalf = items.subList(half, items.size());

            firstHalf = new ArrayList(mergeSort(firstHalf));
            secondHalf = new ArrayList(mergeSort(secondHalf));

            List<E> result = new ArrayList();
            int totalSize = firstHalf.size() + secondHalf.size();
            E firstItem = firstHalf.removeFirst();
            E secondItem = secondHalf.removeFirst();
            boolean firstHalfDone = false;
            boolean secondHalfDone = false;

            for (int i = 0; i < totalSize; i++)
            {

                if (secondHalfDone || (!firstHalfDone && firstItem.compareTo(secondItem) < 0))
                {
                    result.add(firstItem);
                    firstHalfDone = firstHalf.isEmpty();
                    if (!firstHalfDone)
                    {
                        firstItem = firstHalf.removeFirst();
                    }
                }
                else
                {
                    result.add(secondItem);
                    secondHalfDone = secondHalf.isEmpty();
                    if (!secondHalfDone)
                    {
                        secondItem = secondHalf.removeFirst();
                    }
                }
            }
            return result;
        }
    }
}
