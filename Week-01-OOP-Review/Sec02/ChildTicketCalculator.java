public class ChildTicketCalculator extends StandardTicketCalculator
{
    public ChildTicketCalculator(ShowingTime time, char day)
    {
        super(time, day);
    }

    @Override
    public double calcTicketPrice()
    {
        double childPrice = super.calcTicketPrice();
        return childPrice -= 2.0;
    }
}
