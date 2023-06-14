package pkg2;

import java.util.Scanner;

public class Plaindrome 
{
public static void main(String[] args) 
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the number ");
int n=s.nextInt();
int rev=0;
int rem;
int tmp;

tmp=n;
while(tmp!=0)
{
	rem=tmp%10;
	rev=rev*10+rem;
	tmp=tmp/10;
}
if(n==rev)
	System.out.println("It is  Palindrome Number "+n);
else
	System.out.println("It is not a Palindrome Number " +n);
}
}
