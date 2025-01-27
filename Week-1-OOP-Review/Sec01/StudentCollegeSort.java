import java.util.Comparator;

public class StudentCollegeSort implements Comparator<Student>
{
    @Override
    public int compare(Student o1, Student o2)
    {
        if (o1.getCurrCollege().ordinal() < o2.getCurrCollege().ordinal())
        {
            return -1;
        }
        else if (o1.getCurrCollege().ordinal() > o2.getCurrCollege().ordinal())
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}
