import java.util.Random;

public class Cuckoo extends Bird {

    public Cuckoo(String name) {
        super(name);
    }

    @Override
    public void sing() {
        int rnd = new Random().nextInt(10);
        for (int i = 0; i <= rnd; i++) {
            System.out.println("ку-ку");
        }
    }
}
