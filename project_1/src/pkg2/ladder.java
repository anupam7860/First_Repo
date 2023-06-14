package pkg2;

import java.util.Scanner;

public class ladder 
{
 public static void main(String[] args) 
 {
System.out.println("Please enter the value of marks ");	
Scanner s=new Scanner(System.in);
int marks=s.nextInt();
if((marks>=0)&&(marks<=33))
{
	System.out.println("Failed....");
}
else if((marks>=33)&&(marks<60))
{
	System.out.println("C Grade....");
}
else if((marks>=60)&&(marks<=85))
{
	System.out.println("B Grade....");
}
else if((marks>=85)&&(marks<=100))
{
	System.out.println("A Grade.....");
}
else
{
	System.out.println("Please enter the Correct Value");
}
}
}
