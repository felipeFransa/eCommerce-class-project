package Main;
import model.Shopping;
import model.UserCard;

import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner numberValue = new Scanner(System.in);
        Scanner typeShopping = new Scanner(System.in);
        Scanner purchasePrince = new Scanner(System.in);
        Scanner product = new Scanner(System.in);
        Scanner reading = new Scanner(System.in);

        System.out.println("enter your limit:");
        double valueCard = numberValue.nextDouble();

        UserCard card = new UserCard(valueCard);

        int exit = 1;
        while (exit != 0){

            System.out.println("enter your buy: ");
            String productName = product.nextLine();

            System.out.println("enter the purchase amount: ");
            double valueProduct = purchasePrince.nextDouble();

            System.out.println("enter the type:");
            String typeProduct = typeShopping.nextLine();

            Shopping shopping = new Shopping(productName, valueProduct, typeProduct);
            boolean shoppingValid = card.starShopping(shopping);

            if (shoppingValid) {
                System.out.println("Shopping Valid");
                System.out.println("enter 0 to exit or 1 to continue");
                exit = reading.nextInt();
            }else {
                System.out.println("insufficient funds");
                exit = 0;
            }
        }
        System.out.println("********************************");
        System.out.println("Shopping valid\n");
        Collections.sort(card.getShopping());

        for (Shopping s : card.getShopping()) {
            System.out.println(s.getNameProduct() + " R$ " + s.getProductValue());
        }
        System.out.println("\n********************************");

        System.out.println("\nYour Balance: " + card.getBalance());
    }
}
