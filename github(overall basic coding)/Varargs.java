public class Varargs {
    public static void main(String[] args) {
        int ans = sum(6,7,8);
        System.out.println(ans);
    }
    static int sum(int a,int b){
        return a+b;
    }
    static int sum(int a ,int b,int c){
        return a+b+c;
    }
}
