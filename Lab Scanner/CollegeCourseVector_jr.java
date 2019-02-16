import java.util.*;

public class CollegeCourseVector_jr
{

    public void addStudents(Vector <Student_JoseRamos> s)
    {
        // s.setSize(3);
        for(int i = 0; i<3; i++)
        {
            s.addElement(new Student_ks());
            s.elementAt(i).setInfo();
            s.elementAt(i).printInfo();
        }
    }

    public static void main (String args[])
    {
        CollegeCourse_jr java = new CollegeCourseVector_jr();
        java.addStudents(new Vector <Student_JoseRamos>(3));

    }
}
