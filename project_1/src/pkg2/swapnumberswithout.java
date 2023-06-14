package pkg2;

import java.util.Scanner;

public class swapnumberswithout 
{
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Please enter the Vaule of X & Y");
	int x=s.nextInt();
	int y=s.nextInt();
	System.out.println("Before Swapping numbers " +x+" "+y);
	x=x+y;
	y=x-y;
	x=x-y;
	System.out.println("After Swapping numbers "+x+" " +y);
	
}
}
