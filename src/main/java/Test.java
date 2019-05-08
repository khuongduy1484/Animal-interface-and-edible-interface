import fruit.Fruit;
import fruit.Apple;
import fruit.Orage;
public class Test {
    public static void main(String[] args) {
        Fruit []a = new Fruit[2];
        Apple b = new Apple();
        Orage c = new Orage();
        a[0] = b;
        a[1] = c;
        for (Fruit x:a) {
            System.out.println(x.howtoeat());
        }

    }
}
