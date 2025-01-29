import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class BuggyCode
{
    public static void main(String[] args) throws InvalidSizeException
    {
        boolean exit = false;
        Random rng = new Random();
        Scanner scnr = new Scanner(System.in);        
        String[] brands = {"Gucci", "Old Navy", "Calvin Klein", "Walmart"};        
        String[] sizes = {"s", "m", "l"};
        
        System.out.println("What is your name?");
        String name = scnr.next();
        System.out.println("What is your size? ");
        String pSize = scnr.next();

        Person p = new Person(name, pSize);
        
        ArrayList<Clothing> rack = new ArrayList<>();
        ArrayList<Clothing> shirtRack = new ArrayList<>();
        ArrayList<Clothing> pantsRack = new ArrayList<>();
        
        for (int i = 0; i < 10; i++)
        {
            String size = sizes[rng.nextInt(3)];
            String brand = brands[rng.nextInt(4)];
            if (rng.nextBoolean())
            {
                rack.add(new Shirt(size, rng.nextBoolean(), brand));
            }
            else
            {
                rack.add(new Pants(size, rng.nextBoolean(), brand));
            }
        }
        
        int i = 0;
        for (Clothing c : rack)
        {
            if (c instanceof Shirt)
            {
                shirtRack.add(c);
            }
            else
            {
                pantsRack.add(c);
            }
            
            rack.get(i).setBrand("null");
            i++;
        }
        
        int temp = 0;
        while (!exit)
        {
            System.out.println("\nRack");
            System.out.println("----");
            temp = fancyPrint(shirtRack, temp);
            fancyPrint(pantsRack, temp);
            
            System.out.println("Select the line number of the item you would like to try on");
            System.out.println("(or type 'e' to exit)");
            int lineNum = scnr.nextInt();
            
            if (lineNum < temp)
            {
                shirtRack.get(lineNum).tryOn(p);
            }
            else
            {
                pantsRack.get(lineNum - temp).tryOn(p);
            }
            temp = 0;
        }
    }    
    
    public static int fancyPrint(ArrayList<Clothing> r, int start)
    {
        int num = start;

        for (Clothing c : r)
        {
            System.out.println(num + ": " + c);
            num++;
        }
        return num;
    }
}
