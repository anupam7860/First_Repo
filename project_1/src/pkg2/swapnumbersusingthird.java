package pkg2;

import java.util.Scanner;

public class swapnumbersusingthird 

{
public static void main(String[] args)
{
int z;
Scanner s=new Scanner(System.in);
System.out.println("Enter the Value of X & Y");
int x=s.nextInt();
int y=s.nextInt();
System.out.println("Before Swapping numbers " +x +" "+y);

z=x;
x=y;
y=z;
System.out.println("After swapping numbers "+x +" "+y);
}
	
}
