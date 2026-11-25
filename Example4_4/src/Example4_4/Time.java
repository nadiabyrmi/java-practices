package Example4_4;
public class Time
{
	private int hour,minute,second;
	Time(int h,int m,int s)
	{
		hour=h;
		minute=m;
		second=s;
	}
	public void showTime()
	{
		System.out.println(hour+" : "+minute+" : "+second);
	}

}
