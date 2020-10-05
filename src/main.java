import java.util.Random;
import java.util.Scanner;

public class main {
    private static String name;

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        boolean beingisAlive = true;
        boolean animalisAlive = true;
        int year = 0;

        System.out.println("What's your name?");
        name = input.next();

        Plants ground = new Plants();
        //Get Ground Stuff
        ground.getGroundType();
        ground.getIsDry();

        //Plants
        ground.getPlants();
        ground.getColor();
        ground.getHeight();

        //Animals
        Animals animal = new Animals();
        animal.getAnimal();
        animal.getName();
        animal.getAge();
        animal.getWeight();

        //People
        People being = new People();
        being.getAnimal();
        being.getName();
        being.getAge();
        being.getWeight();

        //The Story
        System.out.println("In " + name +"'s world, his/her ground is made out of " + ground.returnGroundType() + " and it is " + ground.returnIsDry() + ". ");
        System.out.println(name + "'s world also has " + ground.returnPlants() + ". The " + ground.returnPlants() + " are mostly " + ground.returnColor() + " and is about " + ground.returnHeight() + " inches tall. ");
        System.out.println(name + "'s world has a " + animal.returnAnimal() + " in it. It's name is " + animal.returnName() + ". " + animal.returnName() + " is " + animal.returnAge() + " years old and weights about " + animal.returnWeight() + " pounds. " );
        System.out.println(name + " also has a " + being.returnAnimal() + " in their world. The " + being.returnAnimal() + " name is " + being.returnName() + ". They are " + being.returnAge() + " years old and weights about " + being.returnWeight() + " pounds.");

        //Simulation
        do {
            //To age or kill
            System.out.println("____________________");
            System.out.println("Type '0' to advance one year");
            System.out.println("Type '1' to kill a living thing");
            int SimAnswer = input.nextInt();
            System.out.println(SimAnswer);
            if (SimAnswer == 0) {
                year++;
                System.out.println("Year: " + year);
                if (beingisAlive){
                    being.getOlder();
                    being.gainWeight();
                    System.out.println(being.returnName() + " is now " + being.returnAge() + " years old. They also gained weight. They are now " + being.returnWeight() + " pounds");
                } else {
                    System.out.println(being.returnName() + " is dead");
                }
                if (animalisAlive) {
                    animal.getOlder();
                    animal.gainWeight();
                    System.out.println(animal.returnName() + " is now " + animal.returnAge() + " years old. They also gained weight. They are now " + animal.returnWeight() + " pounds");
                } else {
                    System.out.println(animal.returnName() + " is dead");
                }
            } else if (SimAnswer == 1) {
                if (new Random().nextInt(2) == 0) {
                    if (beingisAlive) {
                        beingisAlive = false;
                        System.out.println(being.returnName() + " was killed");
                    } else {
                        animalisAlive = false;
                        System.out.println(animal.returnName() + " was killed");
                    }
                } else {
                    if (animalisAlive) {
                        animalisAlive = false;
                        System.out.println(animal.returnName() + " was killed");
                    } else {
                        animalisAlive = false;
                        System.out.println(being.returnName() + " was killed");
                    }
                }
            }
        }
        while(beingisAlive || animalisAlive);
        System.out.println("The World Ended. No one is alive");
    }
}
