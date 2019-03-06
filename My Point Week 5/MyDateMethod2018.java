class MyDateMethod2018
{
	//DECLARE THREE VARIABLES TO REPRESENT THE DATE --member variables
	String month;
	int day;
	int year;
	
	public void setDate(String m, int d, int y)
	{
		
		month = m;
		day = d;
		year = y;
		
	}
	
	public String getDate() 
	{
		 String printedDate = month + " " + day + "," + year; 
		 return printedDate;
	}
	

	//OPEN MAIN METHOD
	public static void main(String args[])
	{
		MyDateMethod2018 today = new MyDateMethod2018();
		today.setDate("March", 22, 2018);
		System.out.println("Todays date is: " + today.getDate());
		
		
	}//end main
}//end class