import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = n.nextInt();
        int sum = 0;
        for (int i = 0; i < number; i++) {
            if((i % 2 != 0) && (i % 3 !=0) && (i % 5 !=0)){
                sum++;
            }
        }
        System.out.println("The sum of all natural numbers before " + number + " = " + sum);
    }
}
