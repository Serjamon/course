public abstract class Bird implements Singable{

    String name;

    public Bird(String name) {
        this.name = name;
    }

    public abstract void sing();

}
