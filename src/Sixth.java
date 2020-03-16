import java.util.Scanner;

public class Sixth {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        System.out.print("Enter the quantity of Peter's money: ");
        int money = m.nextInt();
        Scanner p = new Scanner(System.in);
        System.out.print("Enter the price of ice-cream: ");
        int price = p.nextInt();
        int quantity = 0;
            while(money >= price){
                money -= price;
                quantity++;
            }

        System.out.println(quantity);
    }
}
