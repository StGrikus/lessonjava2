import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        Person person1 = new Person(1, "Arthur");
        Person person2 = new Person(2, "Anastasia");
        Person[] people = {new Person(3,"Alexandra"),
                new Person(4, "Viktoria"),
                new Person(5, "Georgiy")};

        try {
            FileOutputStream fos = new FileOutputStream("people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeInt(people.length);

            for (Person person : people) {
                oos.writeObject(person);
            }

            oos.writeObject(person1);
            oos.writeObject(person2);

            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
