import java.util.*;

public class Quiz2
{
    public static void main(String[] args)
    {
        System.out.println(methodName("4"));
        Stack<Queue<String>> names = new Stack<>();

        Queue<String> q1 = new java.util.LinkedList<>();
        q1.offer("Travis");
        q1.offer("Kayleigh");
        q1.offer("Mike");
        names.push(q1);

        Queue<String> q2 = new ArrayDeque<>();
        q2.offer("Karen");
        q2.offer("Clarissa");
        names.push(q2);

        Queue<String> q3 = new java.util.LinkedList<>();
        q3.offer("Thomas");
        q3.offer("Darryl");
        q3.offer("Lingwei");
        names.push(q3);

        System.out.println(names.peek().peek());
        names.pop();
        names.peek().offer("Henry");
        System.out.println(names.pop().poll());

        PriorityQueue<String> namesOrder = new PriorityQueue<>();
        for (Queue<String> q : names)
        {
            for (String name : q)
            {
                namesOrder.offer(name);
            }
        }
        System.out.println(namesOrder);
        System.out.println(namesOrder.poll());
    }

    public static String methodName(String number)
    {
        Random rng = new Random();
        int ranNum;

        if (number.length() > 5)
        {
            return shuffleString(number);
        }
        else
        {
            int hiddenNum = Integer.parseInt(number.substring(0, 1));

            do
            {
                ranNum = rng.nextInt(9);
            }
            while (ranNum == hiddenNum);

            number += ranNum;
            return methodName(number);
        }
    }

    public static String shuffleString(String toMix)
    {
        ArrayList<Character> temp = new ArrayList<>();
        String toReturn = "";

        for (Character c : toMix.toCharArray())
        {
            temp.add(c);
        }
        Collections.shuffle(temp);

        for (Character c : temp)
        {
            toReturn += c;
        }
        return toReturn;
    }
}
