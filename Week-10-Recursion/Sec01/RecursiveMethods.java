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
}
