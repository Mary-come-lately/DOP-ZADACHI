import java.util.Scanner;

public class Fourth {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter the quantity of grass_cutter: ");
        double gruss_cutter = n.nextDouble();
        Scanner t = new Scanner(System.in);
        System.out.print("Enter the time of first gruss_cutter: ");
        double time = t.nextDouble();
        double sum = 0;
        for (double i = 0; i < gruss_cutter ; i++) {
            sum += time + 0.10 ;
        }
        int hours = (int)sum; //выделяем часы
        double minutes = sum - hours; //выделяем минуты

        System.out.println("The gruss_cutters working : " + hours + " hours " + minutes + " minutes");
    }
}
