import java.util.Scanner;

interface Multiplication
{
   
    void multiplication(int x);

  
    default void defaultMethod()
    {
        System.out.println("Table Created");
    }
}

class Question4
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);


        System.out.println("enter the no. for which multiplication table is created");

        int n = sc.nextInt();

        Multiplication ml = (int x)->System.out.println(n*x);

        System.out.println("The Multiplication table of "+n+" is :");

        for (int i = 1; i <=10 ; i++) {

            ml.multiplication(i);
        }

    }
}
