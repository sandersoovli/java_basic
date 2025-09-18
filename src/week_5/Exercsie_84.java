package week_5;

public class Exercsie_84 {
    private int value;
    private boolean check;

    public Exercsie_84(int startingValue, boolean check) {
        this.value = startingValue;
        this.check = check;
    }

    public Exercsie_84(int startingValue) {
        this(startingValue, false);
    }

    public Exercsie_84(boolean check) {
        this(0, check);
    }

    public Exercsie_84() {
        this(0, false);
    }

    public int value() {
        return this.value;
    }

    public void increase() {
        this.value++;
    }

    public void decrease() {
        if (!check || this.value > 0) {
            this.value--;
        }
    }
}

