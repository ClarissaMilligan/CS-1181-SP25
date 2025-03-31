public class RecursiveMethods
{
    public static void main(String[] args)
    {
        System.out.println(reverseWord("casdfghjkfbyvge"));
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
}
