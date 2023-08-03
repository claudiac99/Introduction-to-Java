import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String name;
        System.out.print("Hi! Give your name: ");
        name = scanner.next();
        System.out.print("Hello " + name);
        /*System.out.printf("Hello %s", name);

          %s formats strings
          %d formats decimal integers
          %f formats floating-point numbers
          %t formats date/time values
          %n line separator
        */
    }
}