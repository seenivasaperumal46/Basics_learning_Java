import java.util.Scanner;

public class Sunnday {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int day=sc.nextInt();
        System.out.println(happy(n,day));
    }
    static int happy(int n,int day){
        if(day<1 || day>7){
            return 0;
        }
        int count =(n+(7-day))/7;
        return count;
    }
}
