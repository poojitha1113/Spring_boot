import java.util.Scanner;
class IfElse220301
{
public static void main(String[]args)
{
Scanner obj=new Scanner(System.in);
System.out.println("Enter 3 numbers");
int a=obj.nextInt();
int b=obj.nextInt();
int c=obj.nextInt();

System.out.println("Your values are"+a+"   " +b+" "+c);
if(a>b&&a>c)
	{
		System.out.println(a+"    is larger number");
	}
else if(b>c)
	{
	  	System.out.println(b+"    is larger number");

	}
else 
	{
	  	System.out.println(c+"    is larger number");

	}
}
}