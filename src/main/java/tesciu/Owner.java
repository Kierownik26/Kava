package tesciu;

import java.util.ArrayList;
import java.util.List;

public class Owner {
    public static void main(String[] args) {
        Animal cat = new Animal();
        cat.speak();
        cat.feed("Snickers", 6);

        cat.setSpeed(5);
        cat.move(10);
        cat.move(1000);
//        Animal polly = new Nieswiszczuk("Nieswiszczuk");
//        Nieswiszczuk.setSpeed(5);


        Food mortadela = new Food("MORTADELA", 1337);

        cat.feed(mortadela);

        List<Food> zarcie = new ArrayList<>();
        zarcie.add(mortadela);
    }
}
