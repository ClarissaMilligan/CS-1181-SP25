import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class BuggyCodeSec02
{
    public static void main(String[] args) throws InvalidSizeException
    {
        boolean exit = false;
        boolean incorrectSize = true;
        Random rng = new Random();
        Scanner scnr = new Scanner(System.in);
        String[] brands = {"Gucci", "Old Navy", "Calvin Klein", "Walmart"};
        String[] sizes = {"s", "m", "l"};

        Person p = new Person("", "m");

        System.out.println("What is your name?");
        String name = scnr.next();
        p.setName(name);

        while (incorrectSize)
        {
            System.out.println("What is your size? ");
            String pSize = scnr.next();

            try
            {
                p.setSize(pSize);
                incorrectSize = false;
            }
            catch (InvalidSizeException ise)
            {
                System.out.println("Invalid Size. Must be 's', 'm', or 'l'.");
            }
        }

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
            if (c instanceof Shirt s)
            {
                shirtRack.add(new Shirt(s));
            }
            else
            {
                pantsRack.add(new Pants((Pants)c));
            }

            rack.get(i).setBrand("null");
            i++;
        }


        int temp = 0;
        while (!exit)
        {
            try
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
                } else
                {
                    pantsRack.get(lineNum - temp).tryOn(p);
                }
            }
            catch (IndexOutOfBoundsException ioobe)
            {
                System.out.println("Invalid index provided");
            }
            catch (InputMismatchException ime)
            {
                if (scnr.hasNextLine())
                {
                    String input = scnr.nextLine();
                    if (input.equalsIgnoreCase("e"))
                    {
                        exit = true;
                    }
                    else
                    {
                        System.out.println("Must enter either 'e' or a valid index");
                    }
                }

            }
            catch (Exception e)
            {
                System.out.println("oops");
            }
            finally
            {
                temp = 0;
            }
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
