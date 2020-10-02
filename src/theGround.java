import java.util.Scanner;

public class theGround {

    private String groundType;
    private String isDry;

    public theGround(){

    }

    public void getGroundType() {
        Scanner input = new Scanner(System.in);
        System.out.println("What kind of soil is in your world?");
        groundType = input.next();
    }

    public void getIsDry() {
        Scanner input = new Scanner(System.in);
        System.out.println("Is it dry or wet?");
        isDry = input.next();
    }

    public String returnGroundType() {
        return groundType;
    }

    public String returnIsDry() {
        return isDry;
    }
}
