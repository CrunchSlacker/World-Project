import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String name;

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


        System.out.println("In " + name +"'s world, his/her ground is made out of " + ground.returnGroundType() + " and it is " + ground.returnIsDry() + ". ");
        System.out.println(name + "'s world also has " + ground.returnPlants() + ". The " + ground.returnPlants() + " are mostly " + ground.returnColor() + " and is about " + ground.returnHeight() + " inches tall. ");
        System.out.println(name + "'s world has a " + animal.returnAnimal() + " in it. It's name is " + animal.returnName() + ". " + animal.returnName() + " is " + animal.returnAge() + " years old and weights about " + animal.returnWeight() + " pounds. " );
        System.out.println(name + " also has a " + being.returnAnimal() + " in their world. The " + being.returnAnimal() + " name is " + being.returnName() + ". They are " + being.returnAge() + " years old and weights about " + being.returnWeight() + " pounds. That's all!");
    }
}
