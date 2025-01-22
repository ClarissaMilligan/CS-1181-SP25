public class StandardTicketCalculator
{
    public enum ShowingTime {MATINEE, AFTERNOON, EVENING};
    ShowingTime currShowingTime = ShowingTime.MATINEE;
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
}
