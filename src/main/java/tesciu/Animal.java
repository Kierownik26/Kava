package tesciu;

import java.util.List;

public class Animal {
    String species;
    int age;
    long haircount;
    boolean isAlive = true;
    char aChar;
    float aFloat;
    double aDouble;
    long caloriesCounter=0L;
    int speed;
//    public Animal(String species){
//        this.species=species;
//    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
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

    public void feed(Food food) {
        if (food.FoodType.equals("syf")) {
            System.out.println("bleh");
            isAlive=false;
        }
        if(isAlive){
            System.out.println("Eating"+food.FoodType+"having"+food.calories+"calories");
            caloriesCounter+=food.calories;
            System.out.println("Calories eaten today:"+caloriesCounter);
        }
    }
    public void feed(List<Food> foods) {
        for (Food f : foods) {
            if (isPoison(f)) {
                System.out.println("Nie zjem tego");
            }
            else {
                feed(f);
            }
        }
    }

    private static boolean isPoison(Food food) {
        return food.FoodType.equals("uran");
    }

    public void move(int distance) {
        if(speed==0){
            System.out.println("Resting");
        }
        else{
            double timeToReach = (double) speed / distance;
            System.out.println("Teleportuję się. Za" + timeToReach + "sekund tam będę");
        }
    }
}
