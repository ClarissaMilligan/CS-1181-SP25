public abstract class Clothing
{
    private String size = "";
    private boolean isNew = true;
    private String brand = "";
    
    public Clothing (String size, boolean isNew, String brand) throws InvalidSizeException
    {
        setSize(size);
        setIsNew(isNew);
        setBrand(brand);
    }
    
    public Clothing (Clothing c) throws InvalidSizeException
    {
        setSize(c.getSize());
        setIsNew(c.isIsNew());
        setBrand(c.getBrand());
    }
    
    public abstract void tryOn(Person p);
    
    public String toString()
    {
        String condition = "used";
        if (this.isIsNew())
        {
            condition = "new";
        }
        return "[size: " + this.getSize() + "] [condition: " + condition + "] [brand: " + this.getBrand() + "]";

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

    public void setIsNew(boolean isNew)
    {
        this.isNew = isNew;
    }

    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    public String getSize()
    {
        return size;
    }

    public boolean isIsNew() {
        return isNew;
    }

    public String getBrand()
    {
        return brand;
    }
    
}
