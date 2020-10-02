import java.util.Scanner;

public class Plants extends theGround {

    private String Plants;
    private String Color;
    private int Height;

    public void getPlants() {
        Scanner input = new Scanner(System.in);
        System.out.println("What kind of plants are there?");
        Plants = input.next();
    }

    public void getColor() {
        Scanner input = new Scanner(System.in);
        System.out.println("What's the color of the " + Plants + "?");
        Color = input.next();
    }

    public void getHeight() {
        Scanner input = new Scanner(System.in);
        System.out.println("How tall is the "+ Plants + " in inches?");
        Height = input.nextInt();
    }

    public String returnPlants() {
        return Plants;
    }

    public String returnColor() {
        return Color;
    }

    public int returnHeight() {
        return Height;
    }
}
