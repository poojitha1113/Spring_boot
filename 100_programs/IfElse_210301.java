import java.util.Scanner;
class IfElse_210301
{
public static void main(String[]args)
{
	System.out.println("If Else Conditions");
	Scanner obj=new Scanner(System.in);
System.out.println("Enter a number to check it even /odd ");
	int a=obj.nextInt();
	if(a%2==0)
	
	{
		System.out.println("Even Number");
	}
	else
	{
		System.out.println("Odd Number");

	}
}
}