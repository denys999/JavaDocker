import java.util.Scanner;

public class Input {
//java.lang with String in imported by default
//     new Scanner(parameter of calss)
//    (System.in); input from console
//    nextLine(); for string
    public static void main(String[] args) {
//        common Class - physical , specific object
        String s = new String("Hello"); //class
        Scanner scan = new Scanner(System.in);
        System.out.println("input something");
        int x = scan.nextInt();
        int addition = 10;
        int equation = x+10;
        System.out.println("result of equation "+x+"+"+addition+"=" +equation);


    }

}
