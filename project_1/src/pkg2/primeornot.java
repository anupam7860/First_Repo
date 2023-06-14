package pkg2;

import java.util.Scanner;

public class primeornot 
{
	
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the value ");
int n=s.nextInt();
int tmp=0;

for(int i=2;i<n;i++)
{ 
	
	if(n%i==0)
	{
		tmp++;
		break;
	}
}
	if(tmp==0)
		System.out.println("is prime number " +n);
	else
		System.out.println("is not a prime number "+n);
		

}
}

