import java.util.Scanner;
class LargestNumber
{
public static void main(String[]args)
{
	Scanner obj=new Scanner(System.in);		
	System.out.println("Enter the 1st value");
	int a=obj.nextInt();
	System.out.println("Enter  the 2nd value");
	int b=obj.nextInt();

	System.out.println("your inputs are "+a+"  "+b);
	System.out.println("------------------");
	if(a>b)
	
	System.out.println("1st value  is big Number"  +a);
	 else
	System.out.println("2nd value is big Number"  +b);
	
}
}