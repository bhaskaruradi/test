import java.util.Scanner;

public class Mars {
public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String s = in.next();
        
        System.out.println(count(s, "SOS"));
}
    
private static int count(String input, String pattern) {
        
    int i = 0;
    int p = 0;
        
    int count = 0;
    while (i < input.length()) {

        if (input.charAt(i) != pattern.charAt(p)) {
            count++;
        }

        i++;
        p = (p + 1) % pattern.length();
    }
        
    return count;

}
}
