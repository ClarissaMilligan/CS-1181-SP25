import java.util.ArrayList;
import java.util.Random;

public class BingoMachine <T>
{
    private ArrayList<T> balls = new ArrayList<>();
    private Random rng = new Random();

    public BingoMachine(T initialValue)
    {
        balls.add(initialValue);
    }

    public void add(T newValue)
    {
        balls.add(newValue);
    }

    public T pickItem()
    {
        int index = rng.nextInt(balls.size());

        T item = balls.get(index);
        balls.remove(index);
        return item;
    }

    public boolean isEmpty()
    {
        return balls.isEmpty();
    }

    public void clear()
    {
        balls.clear();
    }
}
