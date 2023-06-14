package pkg2;

import java.util.Scanner;

public class ReverseName
{
public static void main(String[] args) 
{
	System.out.println("Enter the Name");
	Scanner s=new Scanner(System.in);
	String n=s.nextLine();
	String rev= "";
	int leng=n.length();
	for(int i=leng-1;i>=0;i--)
	{
		rev=rev+n.charAt(i);
		
	}
	System.out.println("Reverse name is "+n+"is " +rev);
	

}
}
