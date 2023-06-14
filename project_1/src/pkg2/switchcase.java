package pkg2;

import java.util.Scanner;

public class switchcase 
{
public static void main(String[] args) 
{
System.out.println("Please enter value of a ");
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
int operator=s.nextInt();
int result;

switch (operator) {
case 1:
	result=a+b;
	System.out.println("result is "+result);
	break;
case 2:
	result=a-b;
	System.out.println("result is" +result);
	break;
case 3:
	result=a*b;
	System.out.println("result is" +result);
	break;
case 4:
	result=a/b;
	System.out.println("result is" +result);
	break;
case 5:
	result=a+b*a-b;
	System.out.println("result is" +result);
	break;
default:
	System.out.println("Please enter correct operator");
	break;
}
}
}
