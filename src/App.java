import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int km = sc.nextInt();
        double fuel = sc.nextDouble();
        double calculo = km/fuel;
        DecimalFormat decimal = new DecimalFormat("0.000");
        System.out.println(decimal.format(calculo) +" km/l");
        sc.close();
    }
}
