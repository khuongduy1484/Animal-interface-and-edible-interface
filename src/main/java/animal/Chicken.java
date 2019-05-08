package animal;
import edible.Edible;
public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "chicken : cuc cuc";
    }

    @Override
    public String howtoeat() {
        return "co the chien";
    }
}
