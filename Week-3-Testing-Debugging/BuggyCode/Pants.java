public class Pants extends Clothing
{
    public Pants(String size, boolean isNew, String brand) throws InvalidSizeException
    {
        super(size, isNew, brand);
    }
    
    public Pants(Pants p) throws InvalidSizeException
    {
        super(p);
    }

    @Override
    public void tryOn(Person p)
    {
        System.out.println(p.getName() + " tries on " + this.toString());
        System.out.println("...");
        if (super.getSize().equalsIgnoreCase(p.getSize()))
        {
            System.out.println("The pants fit!");
        }
        else
        {
            System.out.println("The pants don't fit!");
        }
    }
    
    @Override
    public String toString()
    {
        return "PANTS " + super.toString();
    }
}
