public class Test {

    public static void main(String[] args) {
        //counter(3);

        System.out.println(fac(4));
    }

    private static int fac(int n) {
        if(n==1)
            return 1;

        return n * fac(n-1);
    }
    //counter(3) 3 не ровняется 0 идем дальше, 3-1=2, 2 не ровнятся 0, идем дальше 2-1=1, 1 не ровняетя 0, идем дальше
    //1-1=0, 0=0, не идем дальше, завершаем программу
    //counter(3)->counter(2)->counter(1)
    //они находятся в стеке
    //counter(3)
    //counter(2)
    //counter(1)
    //counter(0)

    /*private static void counter(int n) {

        if (n==0)
            return;

        System.out.println(n);

        counter(n-1);
    }


        /*
        Animal animal = Animal.CAT;
        animal.getTranslation();
        System.out.println(animal);

        Seasons winter = Seasons.WINTER;
        System.out.println(winter.ordinal());
        Seasons seasons = Seasons.FALL;
        Animal animal = Animal.CAT;
        System.out.println(seasons.name());
        System.out.println(animal.name());

        Animal dog = Animal.valueOf("DOG");
        System.out.println(dog.getTranslation());

        switch (animal) {
            case CAT:
                System.out.println("It's a cat");
                break;
            case DOG:
                System.out.println("It's a dog");
                break;
            case MOUSE:
                System.out.println("It's a mouse");
                break;
            default:
                System.out.println("It's not an animal");
        }
        Seasons seasons = Seasons.WINTER;
        System.out.println(seasons.getTemperature());
        //  Object -> Test
        //  Object -> Enum -> Season
        //  По конвенции инамы пишутся капсом

        System.out.println(seasons.getClass());

        switch (seasons) {
            case SUMMER:
                System.out.println("It's warm outside");
                break;
            case WINTER:
                System.out.println("It's cold outside");
                break;
        }
    }
 */
}

    /* Старый метод ПЕРЕЧИСЛЕНИЯ так не делается уже
    private static final int DOG = 0;
    private static final int CAT = 1;
    private static final int MOUSE = 2;

    public static void main(String[] args) {
        int animal = CAT;

        switch (animal) {
            case DOG:
                System.out.println("It's a dog");
                break;
            case MOUSE:
                System.out.println("It's a mouse");
                break;
            case CAT:
                System.out.println("It's a cat");
                break;
            default:
                System.out.println("It's not  an animal");
        }
    }
*/
