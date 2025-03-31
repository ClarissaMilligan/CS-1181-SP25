import java.util.ArrayList;

public class RecursivePractice
{
    public static void main(String[] args)
    {
        System.out.println(reverseWord(null));
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

    public static ArrayList<String> permuteWord(String word)
    {
        ArrayList<String> permutations = new ArrayList<>();
        if (word.length() <= 1)
        {
            permutations.add(word);
            return permutations;
        }
        else
        {
            ArrayList<String> temp = new ArrayList<>();
            char letter = ' ';
            String newWord = "";
            for (int i = 0; i < word.length(); i++)
            {
                letter = word.charAt(i);
                newWord = word.substring(0, i) + word.substring(i + 1);
                temp.addAll(permuteWord(newWord));
                for (String partialWord : temp)
                {
                    permutations.add(letter + partialWord);
                }
                temp.clear();
            }
        }
        return permutations;
    }
}
