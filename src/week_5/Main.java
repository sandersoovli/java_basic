package week_5;

public class Main {
    public static void main(String[] args) {
        Exercsie_84 c1 = new Exercsie_84(5, true);
        Exercsie_84 c2 = new Exercsie_84(3);
        Exercsie_84 c3 = new Exercsie_84(true);
        Exercsie_84 c4 = new Exercsie_84(10);

        c1.decrease();
        c2.increase();
        c3.decrease();
        c4.increase();

        System.out.println(c1.value());
        System.out.println(c2.value());
        System.out.println(c3.value());
        System.out.println(c4.value());
    }
}
