import java.util.*;
public class AreaPeri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double l = sc.nextDouble();
        double w = sc.nextDouble();
        double area = l * w;
        double perimeter = 2 * (l + w);
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
        sc.close();
    }
}