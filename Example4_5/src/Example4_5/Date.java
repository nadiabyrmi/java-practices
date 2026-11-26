package Example4_5;

public class Date 
{
	private int month,day,year;
	
	Date() //متد بدون پارامتر
	{
		setDate(8, 12, 2020); //این متد بدون پارامتره پس اومده براش متد Set گذاشته و از این طریق داره بهش مقدار دهی میکنه
	}
	Date(int m,int d,int y)
	{
		setDate(m, d, y);
	}
	public void setDate(int m, int d, int y)
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
