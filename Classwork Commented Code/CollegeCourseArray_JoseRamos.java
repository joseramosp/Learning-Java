public class CollegeCourseArray_ks
{
	public void addStudents(Student_ks roster [])
	{
		for(int i = 0; i<roster.length;i++)
		{	
			roster[i] = new Student_ks();
			roster[i].setInfo();
			roster[i].printInfo();
		}
		/*for(int i = 0; i<roster.length; i++)
		{	
			roster.printInfo();
		}*/
		
	}
	
	public static void main (String args[])
	{
		
		CollegeCourseArray_ks java = new CollegeCourseArray_ks();
		java.addStudents(new Student_ks[3]);
		
	}//end main
		
	
}//end class