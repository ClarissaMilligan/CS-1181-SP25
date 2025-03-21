public class Thing implements Comparable<Thing>
{
    private int number = 0;
    private String word = "";

    // basic constructor
    public Thing(int num, String wd)
    {
        number = num;
        word = wd;
    }

    // basic toString for easier visualization
    public String toString()
    {
        return number + word;
    }

    // this is required to be implemented for any Hash based data structure to work properly
    @Override
    public boolean equals(Object other)
    {
        Thing o = (Thing) other;

        if(o.getNumber() == this.getNumber() && o.getWord().equals(this.getWord()))
        {
            return true;
        }
        return false;
    }

    // this is required to be implemented for any hash based data structure to work
    @Override
    public int hashCode()
    {
        int hash = 7;
        hash = 31 * hash + number;
        hash = 31 * hash + (word == null ? 0 : word.hashCode());
        return hash;
    }

    // this is required to be implemented for Tree based data structure to work
    @Override
    public int compareTo(Thing o)
    {
        return Integer.compare(this.getNumber(), o.getNumber());
    }

    public int getNumber()
    {
        return number;
    }

    public String getWord()
    {
        return word;
    }
}
