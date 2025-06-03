import java.util.Scanner;

public class Switchstatement {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String fruits =in.next();

        switch (fruits) {
            case "mango":
                System.out.println("it is yellow in colour");
                break;
            case "orange":
                System.out.println("it is orange in colour");
                break;
            case "grapes":
                System.out.println("it is black in colour");
                break;
            case "apple":
                System.out.println("it is red in colour");
                break;
            default:
                System.out.println("enter the valid fruits");

        }
    }
}
