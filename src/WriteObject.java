import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        Person person1 = new Person(1,"Arthur",23);
        Person person2 = new Person(2,"Anastasia",19);
        Person[] people = {new Person(3,"Alexandra",10),
                new Person(4, "Viktoria",9),
                new Person(5,"Georgiy",8),
                new Person(6,"Valeria",7),
                new Person(7,"Nency",6),
                new Person(8,"Alexandr",5)};

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
