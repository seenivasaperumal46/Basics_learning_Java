public class Recursion_basics {
    public static void main (String[] args){
        print(1);
    }
    static void  print(int n){
        //base condtion which stops the recursion calls.
        if(n==5){
            System.out.println(n);
            return ;
        }


        System.out.println(n);     //if u print this only their should be a stackoverflow error,which means the stack
                                    // is filled by infinite number of recursion calls.
        print(n+1);
    }
}
