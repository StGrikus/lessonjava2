import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        Person person1 = new Person(1, "Arthur");
        Person person2 = new Person(2, "Anastasia");
        Person[] people = {new Person(1,"Alexandra"),
                new Person(2, "Viktoria"),
                new Person(3, "Georgiy")};

        try {
            FileOutputStream fos = new FileOutputStream("people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            FileOutputStream fos1 = new FileOutputStream("people1.bin");
            ObjectOutputStream oos1 = new ObjectOutputStream(fos1);

            oos1.writeInt(people.length);

            for (Person person : people) {
                oos1.writeObject(person);
            }

            oos.writeObject(person1);
            oos.writeObject(person2);

            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
