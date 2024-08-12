import java.util.Scanner;
class Scanner_001
{
public static void main(String[]args)
{
	Scanner obj=new Scanner(System.in);
	System.out.println("enter a value");

	int a=obj.nextInt();
	System.out.println("Enter b value");
	int b=obj.nextInt();
	System.out.println("===============");
	System.out.println("Sum of a and b id   "+(a+b));	
}
}