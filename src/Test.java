public class Test {

    public static void main(String[] args) {
        Animal animal = Animal.CAT;
        animal.getTranslation();
        System.out.println(animal);
/*
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
 */
        Seasons seasons = Seasons.WINTER;
        System.out.println(seasons.getTemperature());
/*
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
