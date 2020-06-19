import java.util.*;
class Area{
	public static void main(String [] args)
	{
	setDim();
	}
	public static void setDim()
	{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter 1 no. :");
	int n = sc.nextInt();
	System.out.print("Enter 2 no. :");
	int n1 = sc.nextInt();
	getArea(n,n1);
	}
	public static void getArea(int n1,int n2)
	{
	 System.out.println("Area:" + n1*n2);
	}
}
