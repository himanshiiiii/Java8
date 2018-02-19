interface custom {


    void abstract_funct(int num);

    default void printit()
    {
        System.out.println("you are in default");
    }

    static  void showit()
    {
        System.out.println("you are in static");
    }

}

public class Question5 implements custom
{
    @Override
    public void abstract_funct(int num) {

        System.out.println("value in abstract function is " + num);
    }

    public static void main(String[] args)
    {
        Question5 c1 = new Question5();

        c1.abstract_funct(5);
        c1.printit();
        custom.showit();
    }
}
