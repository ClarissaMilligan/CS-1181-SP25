public class OOP02
{
    public static void main(String[] args)
    {
        StandardTicketCalculator stc = new StandardTicketCalculator(StandardTicketCalculator.ShowingTime.AFTERNOON, 't');
        System.out.println(stc);

        System.out.println(stc.calcTicketPrice());
        ChildTicketCalculator ctc = new ChildTicketCalculator(StandardTicketCalculator.ShowingTime.AFTERNOON, 't');
        System.out.println(ctc.calcTicketPrice());
    }

}
