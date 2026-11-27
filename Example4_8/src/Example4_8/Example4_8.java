package Example4_8;
public class Example4_8 {

	public static void main(String[] args) 
	{
		double radians=45.0;
		double  d1=5.0, d2=6.5;
		int num, x=10,y=20;
		double degree=90;
		double p =-5.35;
		System.out.println("cos("+radians+")="+ Math.cos(radians));
		System.out.println("pow("+d1+","+d2+")="+Math.pow(d1, d2));
		System.out.println("max("+x+","+y+")="+Math.max(x,y));
		System.out.println("sqrt("+y+")="+Math.sqrt(y));
		System.out.println("round("+d2+")="+Math.round(d2));
		System.out.println("ceil("+p+")="+Math.ceil(p));
		System.out.println("floor("+p+")="+Math.floor(p));
		System.out.println("toRadians("+degree+")="+Math.toRadians(degree));
		System.out.println("exp("+d1+")="+Math.exp(d1));
		System.out.println("generate 5 integer number's less than or equal to 5: ");
		for(int i=0;i<=5;i++)
		{
			num=(int)(5*Math.random());
			System.out.print("num "+i+" = "+num+"\t");
		}
	}

}
