public class StandardTicketCalculator implements Comparable<StandardTicketCalculator>
{
    public enum ShowingTime {MATINEE, AFTERNOON, EVENING};
    public ShowingTime currShowingTime = ShowingTime.MATINEE;
    private char dayOfWeek = ' ';

    private StandardTicketCalculator()
    {
        currShowingTime = ShowingTime.MATINEE;
        dayOfWeek = 'M';
    }

    public StandardTicketCalculator(ShowingTime time, char day)
    {
        currShowingTime = time;
        dayOfWeek = day;
    }

    public double calcTicketPrice()
    {
        double defaultPrice = 15.00;
        if ((dayOfWeek == 's') || (dayOfWeek == 'S'))
        {
            defaultPrice += 3.00;
        }
        if (currShowingTime == ShowingTime.MATINEE)
        {
            defaultPrice -= 1.00;
        }
        return defaultPrice;
    }

    @Override
    public String toString()
    {
        return "Ticket is being purchased for " + currShowingTime + " on " + dayOfWeek + ": " + this.calcTicketPrice();
    }

    public int compareTo(StandardTicketCalculator o)
    {
        if (this.calcTicketPrice() < o.calcTicketPrice())
        {
            return 1;
        }
        else if (this.calcTicketPrice() > o.calcTicketPrice())
        {
            return -1;
        }
        else
        {
            if (this.currShowingTime.ordinal() < o.currShowingTime.ordinal())
            {
                return -1;
            }
            else if (this.currShowingTime.ordinal() > o.currShowingTime.ordinal())
            {
                return 1;
            }
            else
            {
                return 0;
            }
        }
    }
}
