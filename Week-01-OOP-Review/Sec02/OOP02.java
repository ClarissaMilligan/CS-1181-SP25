import java.util.ArrayList;
import java.util.Collections;

public class OOP02
{
    public static void main(String[] args)
    {
        StandardTicketCalculator stc = new StandardTicketCalculator(StandardTicketCalculator.ShowingTime.AFTERNOON, 't');
        System.out.println(stc);

        System.out.println(stc.calcTicketPrice());
        ChildTicketCalculator ctc = new ChildTicketCalculator(StandardTicketCalculator.ShowingTime.AFTERNOON, 't');
        System.out.println(ctc.calcTicketPrice());

        ArrayList<StandardTicketCalculator> tickets = new ArrayList<StandardTicketCalculator>();
        for (int i = 0; i < 5; i++)
        {
            if (i == 2 || i == 4)
            {
                tickets.add(new StandardTicketCalculator(StandardTicketCalculator.ShowingTime.AFTERNOON, 'T'));
            }
            else if (i == 3)
            {
                tickets.add(new StandardTicketCalculator(StandardTicketCalculator.ShowingTime.MATINEE, 'S'));
            }
            else if (i == 1)
            {
                tickets.add(new StandardTicketCalculator(StandardTicketCalculator.ShowingTime.EVENING, 'T'));
            }
            else
            {
                tickets.add(new StandardTicketCalculator(StandardTicketCalculator.ShowingTime.EVENING, 'S'));
            }
        }

        for (StandardTicketCalculator s : tickets)
        {
            System.out.println(s);
        }

        Collections.sort(tickets);
        System.out.println();

        for (StandardTicketCalculator s : tickets)
        {
            System.out.println(s);
        }

        Collections.sort(tickets, new TicketTimeSorter());
        System.out.println();

        for (StandardTicketCalculator s : tickets)
        {
            System.out.println(s);
        }
    }

}
