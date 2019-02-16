public class CollegeCourse_jr
{

    public void addStudents(Student_JoseRamos s [])
    {
        for(int i = 0; i< s.length; i++)
        {
            s[i] = new Student_JoseRamos();
            s[i].setInfo();
            s[i].printInfo();
        }
    }

    public static void main (String args[])
    {
        Student_JoseRamos studentArray[] = new Student_JoseRamos[3];
        CollegeCourse_jr java = new CollegeCourse_jr();
        java.addStudents(studentArray);

    }
}
