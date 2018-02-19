import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable {
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


	public void setAge(int age) {
		this.age = age;
	}
    public int getAge() {
        return age;
    }

}

class SubClass extends Employee {

    private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {
        throw new NotSerializableException();
    }

    private void writeObject(ObjectOutputStream oos) throws IOException {
        throw new NotSerializableException();
    }
}

public class Question2 {

    public static void main(String... args) throws Exception{
    Question2 q= new Question2();
		q.serializeObject();
        q.deserializeObject();
    }

    private void serializeObject() throws FileNotFoundException, IOException {
       ObjectOutputStream objectOutputStream = new ObjectOutputStream(
        new FileOutputStream(new File("/home/himanshi/ttn/emp.ser")));

        Employee e = new Employee();

        e.setName("Old Name");
        e.setAge(19);
        objectOutputStream.writeObject(e);
        objectOutputStream.close();
        objectOutputStream  = new ObjectOutputStream(
                new FileOutputStream(new File("/home/himanshi/ttn/emp.ser")));
        e.setName("himanshi new");
        e.setAge(20);
        objectOutputStream.writeObject(e);
        objectOutputStream.close();

    }

    private void deserializeObject() throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(new File("/home/himanshi/ttn/emp.ser")));
        Employee e = (Employee) objectInputStream.readObject();
        System.out.println("Employee Name: " + e.name);
        System.out.println("Employee Age:"+e.age);
        objectInputStream.close();
    }
}

