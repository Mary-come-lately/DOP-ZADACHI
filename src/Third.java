import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int number = n.nextInt();
        int sum = 0;
        for (int i = 1; i <=number ; i++) {
            System.out.println((int)Math.pow(i,2));
            sum += (int)Math.pow(i,2);
        }
        System.out.println("The sum of squares = " + sum);
    }
}
