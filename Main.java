import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a, b and c: ");
        String input = scanner.nextLine();
        //a b c

        String abc[] = input.split(" ");
        int a = Integer.parseInt(abc[0]);
        int b = Integer.parseInt(abc[1]);
        int c = Integer.parseInt(abc[2]);

        if (a == 0) {
            if (b == 0) {
                System.out.println(-c);
            }
            else {
                System.out.println(-c/b);
            }
        }
        else {
            if (b*b - 4*a*c < 0) {
                System.out.println("vietnam");
            }
            else {
                System.out.println((-b+sqrt(b*b - 4*a*c))/(2*a));
                System.out.println((-b-sqrt(b*b - 4*a*c))/(2*a));
            }
        }
    }
}
