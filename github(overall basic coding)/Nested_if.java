import java.util.Scanner;

public class Nested_if {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int emp_id =in.nextInt();
        String gf=in.next();

        switch(emp_id){
            case 1:
                System.out.println("seenivasa perumal");
                break;
            case 2:
                System.out.println("rabinson");
                break;
            case 3:
                System.out.println("sudharsan");
                switch(gf){
                    case "mal":
                        System.out.println("mali");
                        break;
                    case "lavs":
                        System.out.println("lavan");
                        break;
                    case "aisu":
                        System.out.println("aishu");
                        break;
                    default:
                        System.out.println("single boys");
                    }
                    break;
            default:
                System.out.println("enter the correct emp_id");

                    }
                }
        }



