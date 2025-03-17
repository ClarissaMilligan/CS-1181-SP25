import java.util.*;

public class StackQueueExample
{
    public static void main(String[] args)
    {
        Stack<Integer> s = new Stack<>();

        // If top tile is:
        // 1 then remove 1 tile
        // 2 then remove 2 tiles
        // 3 then add 1 tile

        Random rng = new Random();

        for (int i = 0; i < 5; i++)
        {
            s.push(rng.nextInt(3) + 1);
        }
        System.out.println("Stack is: " + s);

        while (!s.isEmpty())
        {
            int value = s.peek();
            System.out.println("Top tile is: " + value);

            if (value == 1)
            {
                s.pop();
            }
            else if (value == 2)
            {
                s.pop();
                s.pop();
            }
            else
            {
                s.push(rng.nextInt(2) + 1);
            }
        }
        System.out.println("You win!");

//        s.push(5);
//        s.push(3);
//        s.push(8);
//        System.out.println(s);
//        s.pop();
//        s.peek();
//        s.pop();
//        s.push(1);
//        s.push(4);
//        s.pop();
//        System.out.println(s);
//
//        Queue<Integer> q = new ArrayDeque<>();
//
//        q.offer(4);
//        q.offer(7);
//        q.offer(1);
//        System.out.println(q);
//        q.poll();
//        q.poll();
//        q.offer(3);
//        q.offer(1);
//        q.peek();
//        q.offer(3);
//        q.poll();
//        System.out.println(q);

    }
}
