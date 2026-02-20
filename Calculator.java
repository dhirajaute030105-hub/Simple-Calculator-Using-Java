import java.util.Scanner;
class Calculator
{
    public static void main(String args[])
    {
        int a,b,c;
        Scanner s1=new Scanner(System.in);

        System.out.println("Press 1 : Addition");
        System.out.println("Press 2 : Substraction");
        System.out.println("Press 3 : Multiplicatiom");
        System.out.println("Press 4 : Division");

        System.out.println("Enter Your Choice:");

        int value=s1.nextInt();

        switch(value)
        {
            case 1:
                {
                    System.out.println("Enter two numbers :");
                    a=s1.nextInt();
                    b=s1.nextInt();
                    c=a+b;
                    System.out.println("Addition is:"+c);
                    break;
                }
            case 2:
                {
                    System.out.println("Enter two numbers :");
                    a=s1.nextInt();
                    b=s1.nextInt();
                    c=a-b;
                    System.out.println("Substration is:"+c);
                    break;

                }    
            case 3:
                {
                    System.out.println("Enter two numbers :");

                    a=s1.nextInt();
                    b=s1.nextInt();
                    c=a*b;
                    System.out.println("Multiplication is:"+c);
                    break;
                }
            case 4:
                {
                    System.out.println("Enter two numbers :");
                    
                    a=s1.nextInt();
                    b=s1.nextInt();
                    c=a/b;
                    System.out.println("Division is:"+c);
                    break;
                }
            default:
                {
                    System.out.println("you enter the wromg information");
                }
        }
    }
}