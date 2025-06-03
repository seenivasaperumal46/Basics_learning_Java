import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans =0;
        while (true){
            System.out.println("enter the operators:");
            char ch =in.next().trim().charAt(0);
            if(ch =='+' || ch =='-' || ch =='*' || ch=='/' || ch =='%') {
                System.out.print("enter the two number:" );
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if (ch == '+') {
                    ans = num1 + num2;
                }
                if (ch == '-') {
                    ans = num1 - num2;
                }
                if (ch == '*') {
                    ans = num1 * num2;
                }
                if (ch == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                }
                if (ch == '%') {
                    ans = num1 % num2;
                }
                }
                else if(ch =='x' || ch == 'X'){
                    break;
                }
                else{
                    System.out.println("invalid operation");
                }
                System.out.println(ans);
            }

        }
    }
