import java.util.*;
public class AreaPeri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double l = sc.nextDouble();
        double w = sc.nextDouble();
        // double perimeter = 2 * (l + w);
        // double area = l * w;
        
        System.out.printf("Perimeter is 2*(%.1f + %.1f) = %.2f\n", w, l, 2 * (l + w));
        System.out.printf("Area is %.1f * %.1f = %.2f\n", l, w, l * w);
        sc.close();
    }
}