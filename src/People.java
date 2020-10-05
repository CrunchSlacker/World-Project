import java.util.Random;
import java.util.Scanner;

public class People implements iAnimals{

    private String animalType;
    private String animalName;
    private int age;
    private int weight;

    @Override
    public void getAnimal() {
        Scanner input = new Scanner(System.in);
        System.out.println("What other living beings on your world? (Aliens, Hoomans, etc.)");
        animalType = input.next();
    }

    @Override
    public void getName() {
        Scanner input = new Scanner(System.in);
        System.out.println("What's the " + returnAnimal() + " name?");
        animalName = input.next();
    }

    @Override
    public void getAge() {
        Scanner input = new Scanner(System.in);
        System.out.println("How old is " + returnName() + "?");
        age = input.nextInt();
    }

    @Override
    public void getWeight() {
        Scanner input = new Scanner(System.in);
        System.out.println("How much does " + returnName() + " weigh in pounds?");
        weight = input.nextInt();
    }

    @Override
    public void getOlder() {
        age ++;
    }

    @Override
    public void gainWeight() {
        weight = weight + new Random().nextInt(101);
    }


    @Override
    public String returnAnimal() {
        return animalType;
    }

    @Override
    public String returnName() {
        return animalName;
    }

    @Override
    public int returnAge() {
        return age;
    }

    @Override
    public double returnWeight() {
        return weight;
    }
}
