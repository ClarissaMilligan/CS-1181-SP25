import java.util.*;

public class RecursiveMethods
{
    public static void main(String[] args)
    {
        System.out.println(reverseWord("casdfghjkfbyvge"));
        System.out.println(permuteWord("cat"));
    }

    public static String reverseWord(String word)
    {
        if (word.length() <= 1)
        {
            return word;
        }
        else
        {
            return word.charAt(word.length() - 1) + reverseWord(word.substring(0, word.length() - 1));
        }
    }

    public static int countEvens(String nums)
    {
        if (nums.length() <= 1)
        {
            try
            {
                if ((Integer.parseInt(nums) % 2) == 0)
                {
                    return 1;
                } else
                {
                    return 0;
                }
            } catch (Exception e)
            {
                return 0;
            }
        } else
        {
            int first = 0;
            try
            {
                first = Integer.parseInt(nums.substring(0, 1));
                if (first % 2 == 0)
                {
                    first = 1;
                } else
                {
                    first = 0;
                }
            } catch (Exception e)
            {
                first = 0;
            }

            return first + countEvens(nums.substring(1));
        }
    }

    public static <T extends Comparable<T>> T getMax(List<T> list)
    {
        if (list.size() == 1)
        {
            return list.get(0);
        }

        T cur = list.get(0);
        List<T> remainingList = list.subList(1, list.size());

        if(cur.compareTo(getMax(remainingList)) > 0)
        {
            return cur;
        }
        else
        {
            return getMax(remainingList);
        }
    }

    public static ArrayList<String> permuteWord(String word)
    {
        ArrayList<String> returnList = new ArrayList<>();

        if (word.length() <= 1)
        {
            returnList.add(word);
            return returnList;
        }
        else
        {
            for(int i = 0; i < word.length(); i++)
            {
                String letter = word.substring(i, i + 1);
                String theRest = word.substring(0, i) + word.substring(i + 1);

                for (String s : permuteWord(theRest))
                {
                    returnList.add(letter + s);
                }
            }
            return returnList;
        }
    }

}
