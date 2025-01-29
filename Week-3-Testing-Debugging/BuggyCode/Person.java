public class Person
{
    private String name = "";
    private String size = "";
    
    public Person(String name, String size) throws InvalidSizeException
    {
        setName(name);
        setSize(size);
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setSize(String size) throws InvalidSizeException
    {
        if (size.equalsIgnoreCase("s") || size.equalsIgnoreCase("m") || size.equalsIgnoreCase("l"))
        {
            this.size = size;
        }
        else
        {
            throw new InvalidSizeException();
        }
    }

    public String getName()
    {
        return name;
    }

    public String getSize()
    {
        return size;
    }
    
    @Override
    public String toString()
    {
        return this.getName() + " is a size " + this.getSize();
    }
}
