import java.util.Scanner;

public class Seventh {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the sum of loan: ");
        double loan = s.nextDouble();
        Scanner d = new Scanner(System.in);
        System.out.print("Enter thu sum of debt: ");
        double dept = d.nextDouble();
        int ages = 0;
        for (int i = 0; i <= dept; i++) {
            loan *= 0.20;
            ages++;
        }
        System.out.println(ages);
    }
}
