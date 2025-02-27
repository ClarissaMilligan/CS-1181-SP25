import java.util.ArrayList;
import java.util.Random;

public class BingoMachineSec02<T extends Number>
{
    private ArrayList<T> contents = new ArrayList<>();
    private Random rng = new Random();

    public BingoMachineSec02(T initialValue)
    {
        contents.add(initialValue);
    }

    public void add(T newValue)
    {
        contents.add(newValue);
    }

    public T pickItem()
    {
        int index = rng.nextInt(contents.size());

        T item = contents.get(index);
        contents.remove(index);
        return item;
    }

    public boolean isEmpty()
    {
        return contents.isEmpty();
    }

    public void clear()
    {
        contents.clear();
    }

    public void addAll(ArrayList<? extends T> arr)
    {
        contents.addAll(arr);
    }

    public void addToOtherList(ArrayList<? super T> arr)
    {
        arr.addAll(contents);
    }

    @Override
    public String toString()
    {
        String result = "[";

        for (int i = 0; i < contents.size(); i++)
        {
            if (i == contents.size() - 1)
            {
                result += contents.get(i) + "]";
            } else
            {
                result += contents.get(i) + ", ";
            }
        }

        return result;
    }
}
