package Example4_6;
public class Date
{
	private int month, day, year;
	//constructor method
	Date()
	{
		this(8,12,2020);
	}
	Date(int m, int d, int y)
	{
		setDate(m,d,y);
	}
	public void setDate(int m,int d, int y)
	{
		month=m;
		day=d;
		year=y;
	}
	void showDate()
	{
		System.out.println(month+"/"+day+"/"+year);
	}
}
