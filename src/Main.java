import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("RADIUS :");
        int radius = scanner.nextInt();

        Circle circle = new Circle(3.14159265359, radius);

        System.out.println("AREA = " + circle.area(3.14159265359, radius));

        System.out.println("CIRCUMFERENCE = " + circle.circumference(3.14159265359, radius));

    }


}