import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

public class BingoMachineSec02<T extends Number> implements Iterable<T>
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

    @Override
    public Iterator<T> iterator()
    {
        return new BingoMachineSec02Iterator();
    }

    public class BingoMachineSec02Iterator implements Iterator<T>
    {
        private ArrayList<Integer> indices;
        private int nextItem;

        public BingoMachineSec02Iterator()
        {
            nextItem = 0;
            indices = new ArrayList<>();
            for (int i = 0; i < contents.size(); i++)
            {
                indices.add(i);
            }
            Collections.shuffle(indices);
        }

        @Override
        public boolean hasNext()
        {
            return (nextItem < (contents.size()));
        }

        @Override
        public T next()
        {
            return contents.get(indices.get(nextItem++));
        }
    }
}
