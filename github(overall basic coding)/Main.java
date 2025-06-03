public class Main{
    public static void main(String[] args) {

        int salary = 25000;
        if (salary > 10000) {
            salary = salary+1000;
        }
        else{
            salary = salary+500;
        }
        System.out.println(salary);
    }
}