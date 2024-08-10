import java.util.Random;

public class Parrot extends Bird {

    String text;

    public Parrot(String name, String text) {
        super(name);
        this.text = text;
    }

    @Override
    public void sing() {
        int rnd = new Random().nextInt(text.length());
        for (int i = 0; i <= rnd; i++) {
            System.out.print(text.charAt(i));
        }
        System.out.println();
    }
}
