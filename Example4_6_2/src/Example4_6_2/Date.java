package Example4_6_2;
public class Date
{
	private int month,day,year;
	Date()
	{
		setDate(2026,11,27);
	}
	Date(int m, int d, int y)
	{
		setDate(m,d,y);
	}
	public void setDate(int m, int d, int y)
	{
		month=m;
		day=d;
		year=y;
	}
	Date(Date otherDate)
	{
		setDate(otherDate.month, otherDate.day, otherDate.year);
	}
	public void showDate()
	{
		System.out.print(month+"/"+day+"/"+year);
	}

}
