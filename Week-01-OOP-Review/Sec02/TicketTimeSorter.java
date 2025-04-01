import java.util.Comparator;

public class TicketTimeSorter implements Comparator<StandardTicketCalculator>
{
    @Override
    public int compare(StandardTicketCalculator o1, StandardTicketCalculator o2)
    {
        if (o1.currShowingTime.ordinal() < o2.currShowingTime.ordinal())
        {
            return -1;
        }
        else if (o1.currShowingTime.ordinal() > o2.currShowingTime.ordinal())
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}
