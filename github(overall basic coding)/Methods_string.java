import java.util.Arrays;

public class Methods_string {
    public static void main(String[] args) {
        String name = "seeni perumal";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name.charAt(7));
        System.out.println(name.indexOf('s'));
        System.out.println(name.contains("x"));

    }
}
