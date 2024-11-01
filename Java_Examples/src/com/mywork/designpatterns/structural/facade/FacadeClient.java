package com.mywork.designpatterns.structural.facade;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FacadeClient {
    public void displayInput() throws NumberFormatException, IOException {
        int choice = 4;
        do {
            System.out.print("========= Mobile Shop ============ \n");
            System.out.print("            1. IPHONE.              \n");
            System.out.print("            2. SAMSUNG.              \n");
            System.out.print("            3. ONEPLUS.            \n");
            System.out.print("            4. Exit.                     \n");
            System.out.print("Enter your choice: ");

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            choice = Integer.parseInt(br.readLine());
            ShopKeeper sk = new ShopKeeper();

            switch (choice) {
                case 1 -> sk.iphoneSale();
                case 2 -> sk.samsungSale();
                case 3 -> sk.onPlusSale();
                default -> System.out.println("Nothing You purchased");
            }
        } while (true);
    }
}
