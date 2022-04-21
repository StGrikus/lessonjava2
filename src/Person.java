import java.io.Serializable;

public class Person implements Serializable {
    private int id;
    private transient int age;
    private String name;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return id+" : "+name+" : "+age;
    }
}
