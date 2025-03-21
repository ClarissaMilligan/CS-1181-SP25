public class Item implements Comparable<Item>
{
    private int num = 0;
    private String text = "";

    public Item(int n, String t)
    {
        num = n;
        text = t;
    }

    // required if we want to store this object in a Tree data structure
    @Override
    public int compareTo(Item o)
    {
        return Integer.compare(this.getNum(), o.getNum());
    }

    // required if we want to store this object in a Hash Table data structure
    @Override
    public int hashCode()
    {
        int hash = 7;
        hash = 31 * hash + num;
        hash = 31 * hash + (text == null ? 0 : text.hashCode());
        return hash;
    }

    // required if we want to store this object in a Hash Table data structure
    @Override
    public boolean equals(Object o)
    {
        Item i = (Item) o;

        if (this.getNum() == i.getNum() && this.getText().equals(i.getText()))
        {
            return true;
        }
        return false;
    }

    @Override
    public String toString()
    {
        return num + text;
    }

    public int getNum()
    {
        return num;
    }

    public String getText()
    {
        return text;
    }
}
