package Example2_2;
public class Example2_2 {
	public static void main(String[] args) 
	{
		long salary=35000000;
		double tax, netSalary;
		tax= (salary*10)/100;
		netSalary= salary-tax;
		System.out.println("Your net salary is: \t" +salary);
		System.out.println("Tax of your salary is: \t" +tax);
		System.out.println("Your net salary is: \t" +netSalary);
	}
}