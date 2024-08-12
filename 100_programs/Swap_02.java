class Swap_02
{
public static void main(String[]args)
{
	int a=110;
	int b=200;
	System.out.println("Before swapping    a is  "+   a  +"  b is  "+  b);
	
	a=a+b;
	b=a-b;
	a=b+b;
	
	System.out.println("after swaping       a is  "+   a  +"  b is  "+  b);

	
}
}