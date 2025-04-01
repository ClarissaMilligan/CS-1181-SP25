public class GradStudent extends Student
{
    public GradStudent(boolean inState, double fA, College currCollege, char cHR)
    {
        super(inState, fA, currCollege, cHR);
    }

    @Override
    public double getTuition()
    {
        double tuition = super.getTuition();
        return tuition + 3.0;
    }
}
