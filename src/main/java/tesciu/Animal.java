package tesciu;

import java.math.BigInteger;

public class Animal {
    String species;
    int age;
    long haircount;
    boolean isalive;
    char aChar;
    float aFloat;
    double aDouble;
    public void speak() {
        System.out.println("Meow");
        species = "Cat";
        System.out.println("Hello my name is " + species);
    }

    public void feed(String food) {
        System.out.println("Thank you for " + food + " ^-^");
    }
    public void feed(String food, int amount) {
        System.out.println("*Cat has eaten " + amount + " " + food + "*");
        System.out.println("Thank you for " + amount + " " + food + " ^-^");

    }
}
