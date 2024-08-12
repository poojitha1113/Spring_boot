import java.util.Scanner;
class Fahareneit_to_Celsius
{
public static void main(String[]args)
{
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter the Faharenheit");
	int fahareneit=obj.nextInt();
	double celsius=(fahareneit-32)*5/9;
	System.out.println("So the fahareneit is "+fahareneit+"  is   ="+ celsius);
	

}
}