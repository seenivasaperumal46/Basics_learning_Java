import java.util.Locale;

public class Strings_basics {
    public static void main(String[] args) {
        String in = "seenu";
        String inp ="seenu";
       //== method.
        System.out.println(in == inp); //gives true according the object of two different variable with same values;

        // creating new string with same value using new keyword;
        String sc =new String("seeni");
        String sw =new String("seeni");
        System.out.println(sc);
        System.out.println(sw);
        System.out.println(sc == sw);// false bcoz sc has separate object and sc has separate object with same values;

        //now we can check only the values using equals();
        System.out.println(sw.equals(sc));
        // charAt();
        System.out.println(sc.charAt(3));
        System.out.print(sc.toUpperCase());
        System.out.println(sc.toLowerCase());

    }
}
