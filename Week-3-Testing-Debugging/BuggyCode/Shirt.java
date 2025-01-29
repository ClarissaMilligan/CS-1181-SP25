public class Shirt extends Clothing
{
    public Shirt(String size, boolean isNew, String brand) throws InvalidSizeException
    {
        super(size, isNew, brand);
    }
    
    public Shirt(Shirt s) throws InvalidSizeException
    {
        super(s);
    }

    @Override
    public void tryOn(Person p)
    {
        System.out.println(p.getName() + " tries on " + this.toString());
        System.out.println("...");
        if (super.getSize().equalsIgnoreCase(p.getSize()))
        {
            System.out.println("The shirt fits!");
        }
        else
        {
            System.out.println("The shirt doesn't fit!");
        }
    }
    
    @Override
    public String toString()
    {
        return "SHIRT " + super.toString();
    }
}
