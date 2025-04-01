import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

public class BingoMachine <T extends Number> implements Iterable<T>
{
    private ArrayList<T> contents = new ArrayList<>();
    private Random rng = new Random();

    public BingoMachine(T initialValue)
    {
        contents.add(initialValue);
    }

    public void add(T newValue)
    {
        contents.add(newValue);
    }

    public void addAll(ArrayList<? extends T> arr)
    {
        contents.addAll(arr);
    }

    public void addAllToOther(ArrayList<? super T> otherArr)
    {
        otherArr.addAll(contents);
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

    @Override
    public String toString()
    {
        String out = "[";

        for (int i = 0; i < contents.size(); i++)
        {
            if (i == contents.size() - 1)
            {
                out += contents.get(i) + "]";
            }
            else
            {
                out += contents.get(i) + ", ";
            }
        }
        return out;
    }

    @Override
    public Iterator<T> iterator()
    {
        return new BingoMachineIterator();
    }

    public class BingoMachineIterator implements Iterator<T>
    {
        private ArrayList<Integer> indices = new ArrayList<>();
        private int next = 0;

        public BingoMachineIterator()
        {
            for (int i = 0; i < contents.size(); i++)
            {
                indices.add(i);
            }
            Collections.shuffle(indices);
        }

        @Override
        public boolean hasNext()
        {
            return next < contents.size();
        }

        @Override
        public T next()
        {
            return contents.get(indices.get(next++));
        }
    }
}
