
public class MyProg {
    public static void main(String[] args) {

        Bird sp1 = new Sparrow("Уарабэй");
        Bird sp2 = new Sparrow("КАПИТАН Джек Уарабэй");

        Bird cc1 = new Cuckoo("Кукушка");
        Bird cc2 = new Cuckoo("Кукушка-2");

        Bird pr1 = new Parrot("Попка", "Уарабэй и кукшка дураки");
        Bird pr2 = new Parrot("Птиц", "I'm a bird, I'm a bird look at me I'm a bird!");

        birdSays(sp1);
        birdSays(sp2);
        birdSays(cc1);
        birdSays(cc2);
        birdSays(pr1);
        birdSays(pr2);

    }

    public static void birdSays(Singable link){

        System.out.println(((Bird)link).name + " говорит:");
        link.sing();

    }

}

