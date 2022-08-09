
import java.util.Arrays;
import java.util.Scanner;
public class first {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        String str = "aAbBcCDdEeFf";
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        // System.out.println("This is my first java program in visual studio");
        // String str=sca.nextLine();
        for(char i:ch)
            System.out.print(i+" ");
        sca.close();
    }
}
