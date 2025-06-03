public class Scoping {
    public static void main(String[] args) {
        int a = 10;
        int b =20;

        // block scope.
        {
            //int a =30 --->it will be a error bcoz it is already initialized in outside the block so reinitializing is not allowed.
            a =90;  //but we can use it inside the block for change the values,modifying it and all use.
            System.out.println(a);
        }
        System.out.println(a);

        for (int i =0;i<5;i++){
            System.out.print(i);
            int nums =10000;
            a=10000;
        }
        //System.out.println(i); printing i which is initialized inside the loop will not get outside the loop block.
        int nums =4000; //we can initialize the same variable that used inside the block as well as outside the block.
        System.out.println(a);

    }
}
