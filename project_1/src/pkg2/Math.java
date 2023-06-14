package pkg2;

import java.util.Scanner;



public class Math
{
	public int sum(int a, int b)
	{
		int c=a+b;
		return c;
		
	}
	
	public int sub(int a1, int b1)
	{
		int c1=a1-b1;
		return c1;
	}
	
	public int multi(int a2, int b2)
	{
		int c2=a2*b2;
		return c2;
	}
	public int div(int a3, int b3)
	{
		
		int div=a3/b3;
		return div;
	}
	
	public static void main(String[] args) {
		System.out.println("Please enter the data");
		Scanner s=new Scanner(System.in);
		int x1=s.nextInt();
		int x2=s.nextInt();
		int x3=s.nextInt();
		int x4=s.nextInt();
		int x5=s.nextInt();
		int x6=s.nextInt();
		
		Math c=new Math();
		int sumresult=c.sum(x1, x2);
		int sumresult2=c.sum(sumresult,x3);
		int subresult=c.sub(sumresult2, x4);
		int multiresult=c.multi(subresult, x5);
		int divresult=c.div(multiresult, x6);
		System.out.println("((((x1+x2)+x3)-x4)*x5)x6) result is " + divresult);
		
		
			
			
	}
}
