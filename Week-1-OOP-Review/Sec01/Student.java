public class Student
{
    private boolean inState = true;
    private double financialAid = 0.0;
    public enum College {CECS, COSM, COLA, COB, CONH};
    private College currCollege = College.CECS;
    private char creditHourRange = ' ';

    public Student()
    {
        inState = true;
        financialAid = 0.0;
        // ...
    }
    public Student(boolean inState, double fA, College currCollege, char cHR)
    {
        this.inState = inState;
        financialAid = fA;
        this.currCollege = currCollege;
        creditHourRange = cHR;
    }

    public double getTuition()
    {
        double defaultTuition = 40000.0 - financialAid;

        if (!inState)
        {
            defaultTuition += 10000.0;
        }
        if (currCollege == College.CONH)
        {
            defaultTuition += 200000.00;
        }
        else if (currCollege == College.CECS)
        {
            defaultTuition -= 40000.00;
        }

        switch (creditHourRange)
        {
            case 'p':
                defaultTuition *= 2;
                break;
            case 'f':
                break;
            case 'o':
                defaultTuition = 0;
                break;
            default:
                return -1;
        }

        if (defaultTuition < 0)
        {
            return 0.0;
        }
        return defaultTuition;
    }

    @Override
    public String toString()
    {
        double tuition = getTuition();
        return "The student's tuition is " + tuition;
    }
}
