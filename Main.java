import java.util.Scanner;

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
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
