import java.util.*;
public class volumeOfCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double h = sc.nextDouble();
        double volume = 3.14 * r * r * h;
        System.out.printf("Volume is: %.2f\n", volume);
        sc.close();
    }
}