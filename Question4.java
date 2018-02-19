import java.util.Scanner;

interface FuncInterface
{
    // An abstract function
    void abstractFun(int x);

    // A non-abstract (or default) function
    default void normalFun()
    {
        System.out.println("Hello");
    }
}

class Question4
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);


        System.out.println("enter the no. for which multiplication table needs to be generated");

        int n = scanner.nextInt();

        FuncInterface fobj = (int x)->System.out.println(n*x);

        System.out.println("The Multiplication table of "+n+" is :");

        for (int i = 1; i <=10 ; i++) {

            fobj.abstractFun(i);
        }

    }
}