/*🟢 8. String Compression:
Problem: Compress a string by replacing consecutive repeating characters with a single character followed by a count.

Example:

Input: "aaabbcccc"

Output: "a3b2c4"

 */

import java.util.Scanner;

public class String_compression {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        String str =sc.nextLine();
        System.out.println(Compress(str));
    }
    static StringBuilder Compress(String str){
        StringBuilder sb =new StringBuilder();
        int n= str.length();

        for(int i=0;i<n;i++){
            int count=1;
            while(i<n-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if (count>1) sb.append(count);
        }
        return sb;
    }
}
