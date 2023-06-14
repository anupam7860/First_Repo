package pkg2;

import java.util.Scanner;

public class Primeornotwithwhile

{
public static void main(String[] args)
{
int tmp=0;
int i=2;
Scanner s=new Scanner(System.in);
System.out.println("Enter the number: ");
int n=s.nextInt();
while (i<n)
{
	if(n%i==0)
	{
		tmp++;
		break;
			}
i++;
}
if(tmp==0)
	System.out.println("Is a prime Number " +n);
else
	System.out.println("Is not a prime Number " +n);
	}
}
