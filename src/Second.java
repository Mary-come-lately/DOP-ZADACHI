import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner n = new Scanner(System.in);

        double rub = s.nextDouble();
        double ages = n.nextDouble();


        for (int i = 0; i < ages; i++) {

            rub = rub * 1.03;
        }
        System.out.println(String.format("From " + (int)ages + " years your sum will be " + "%(.2f", rub));
    }

}
