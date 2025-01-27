import java.util.ArrayList;
import java.util.Collections;

public class OOP01
{
    public static void main(String[] args)
    {
        ArrayList<Student> students = new ArrayList<>();

        for (int i = 0; i < 5; i++)
        {
            if (i == 0)
            {
                students.add(new Student(true, 3000.0, Student.College.CECS, 'f'));
            }
            else if (i == 2)
            {
                students.add(new Student(true, 3000.0, Student.College.CONH, 'f'));
            }
            else if (i == 1)
            {
                students.add(new Student(false, 10000.5, Student.College.COSM, 'p'));
            }
            else if (i == 3)
            {
                students.add(new Student(true, 7500.0, Student.College.CONH, 'o'));
            }
            else
            {
                students.add(new Student(false, 15.0, Student.College.COB, 'f'));
            }
        }

        for (Student s : students)
        {
            System.out.println(s);
        }

        System.out.println();
        Collections.sort(students);

        for (Student s : students)
        {
            System.out.println(s);
        }

        System.out.println();
        Collections.sort(students, new StudentCollegeSort());

        for (Student s : students)
        {
            System.out.println(s);
        }
    }
}
