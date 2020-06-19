import java.util.*;
class yash1{
	public static void main(String [] args)
	{
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	arm(n);


	}
	public static void arm(int n)
	{
	int temp,sum,count=0;
	temp = n;
	while(temp!=0){
	count++;
	temp= temp/10;
	}
	sum=0;
	temp = n;
	while(n!=0)
	{
	int t = n%10;
	sum+=Math.pow(t,count);
	n=n/10;
	}
	if(temp == sum){
	System.out.println("Armstrong number");
	}
	else
		System.out.println("Not an armstrong number");
	}

}
