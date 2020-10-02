import java.util.Scanner;

public class Animals implements iAnimals{
    private String animal;
    private String animalName;
    private int age;
    private double weight;


    @Override
    public void getAnimal() {
        Scanner input = new Scanner(System.in);
        System.out.println("What animal is in your world?");
        animal = input.next();

    }

    @Override
    public void getName() {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the " + returnAnimal() + " name?");
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
    public String returnAnimal() {
        return animal;
    }

    @Override
    public int returnAge() {
        return age;
    }

    @Override
    public String returnName() {
        return animalName;
    }

    @Override
    public double returnWeight() {
        return weight;
    }
}
