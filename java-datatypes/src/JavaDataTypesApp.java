import java.util.*;
import java.io.*;



class JavaDataTypesApp{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();

    for (int i = 0; i < T; i++) {
        try {
            long n = sc.nextLong();
            System.out.println(n + " can be fitted in:");
            if (n >= Byte.MIN_VALUE && n <= Byte.MIN_VALUE)
                System.out.println("* byte\n* short\n* int\n* long");
            else if (Short.MIN_VALUE && n <= Short.MIN_VALUE)
                System.out.println("* short\n* int\n* long");
            else if (Integer.MIN_VALUE && n <= Integer.MIN_VALUE)
                System.out.println("* int\n* long");
            else
                System.out.println("* long");
        }
        catch (Exception e) {
            System.out.println(sc.next() + " can't be fitted anywhere.");
        }
    }

    sc.close();

}
