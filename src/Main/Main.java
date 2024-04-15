package Main;

import model.Shopping;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner numberValue = new Scanner(System.in);

        Shopping shopping = new Shopping();

        shopping.setNameProduct("Banana");
        shopping.setProductValue(1.99);
        shopping.setProductType("Fruta");

        System.out.println("Digite seu limite:");


    }
}
