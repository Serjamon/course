public class A {

    int x;

    A(int x){
        this.x = x;
    }

    A(String sttr){
        this(Integer.parseInt(sttr));
        System.out.println("Создан А и " + sttr);
    }

    @Override
    public String toString() {
        return "A{" +
                "x=" + x +
                '}';
    }



    public void xyz(){
        System.out.println(x + "ololo");
    }
}
