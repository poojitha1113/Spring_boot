package Code;



// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Calcluation {

    int a=10,b=20,c;
    public  int addition(){
     System.out.println(c=(a+b));
     return c;
    }
    public int multiplication()
    {
        System.out.println(c=(a*b));
        return c;

    }
    public int substraction()
    {

        System.out.println(c=(a-b));
        return c;
    }

    public static void main(String[] args) {
        Calcluation obj=new Calcluation();
        obj.addition();
    }
}