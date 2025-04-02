import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RecursivePractice
{
    public static void main(String[] args)
    {
        // System.out.println(reverseWord(null));
        findCombinations(1, 4, 0, new ArrayList<>());
        // System.out.println(permute("cat"));
        //System.out.println(scramble("happy"));
    }

    public static String reverseWord(String word)
    {
        if (word.length() <= 1)
        {
            return word;
        }
        else
        {
            return reverseWord(word.substring(1)) + word.charAt(0);
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
                }
                else
                {
                    return 0;
                }
            }
            catch (Exception e)
            {
                return 0;
            }
        }
        else
        {
            int first = 0;
            try
            {
                first = Integer.parseInt(nums.substring(0, 1));
                if (first % 2 == 0)
                {
                    first = 1;
                }
                else
                {
                    first = 0;
                }
            }
            catch (Exception e)
            {
                first = 0;
            }

            return first + countEvens(nums.substring(1));
        }
    }

    public static ArrayList<String> permute(String word)
    {
        ArrayList<String> pList = new ArrayList<>();

        if (word.length() <= 1)
        {
            pList.add(word);
            return pList;
        }
        else
        {
            for (int i = 0; i < word.length(); i++)
            {
                String letter = word.substring(i, i + 1);
                String remaining = word.substring(0, i) + word.substring(i + 1);

                for (String p : permute(remaining))
                {
                    pList.add(letter + p);
                }
            }
            return pList;
        }
    }

    public static void findCombinations(int i, int n, int currentSum, List<Integer> combination)
    {
        if (currentSum == n)
        {
            System.out.println(combination);
            return;
        }

        if (currentSum > n || i > n) {
            return;
        }

        // Include i in the combination
        combination.add(i);
        findCombinations(i, n, currentSum + i, combination);

        // Backtrack and exclude i from the combination
        combination.remove(combination.size() - 1);
        findCombinations(i + 1, n, currentSum, combination);
    }

}
