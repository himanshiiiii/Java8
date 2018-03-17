import java.util.ArrayList;
import java.util.*;

class Employee1
{
    String Name;
    int Age;

    Employee1(String name , int age)
    {
        this.Name= name;
        this.Age= age;
    }

    public void setAge(int age)
    {
        Age = age;
    }

    public void setName(String name)
    {
        Name = name;
    }

    public int getAge()
    {
        return Age;
    }

    public String getName()
    {
        return Name;
    }
}

public class Question6
{
    public static void main(String[] args) {
        List<Employee1> list = new ArrayList<>();

        Employee1 emp = new Employee1("himanshi",20);

        list.add(new Employee1("peter", 22));
        list.add(new Employee1("john", 54));
        list.add(new Employee1("vans",65));
        list.add(new Employee1("kitty", 20));
        list.add(new Employee1("ruby", 22));
        list.add(new Employee1("shah", 21));


        System.out.println("The required employees are: ");

        list.stream().filter(p -> p.getName().startsWith("n")).filter(p ->p.getAge()> 24)
                .map(p ->p.getName())
                .forEach(System.out::println);
    }
}
