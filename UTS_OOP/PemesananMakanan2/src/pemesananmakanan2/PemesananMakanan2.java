/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pemesananmakanan2;

import java.util.Scanner;

public class PemesananMakanan2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input user
        System.out.print("Masukkan username: ");
        String username = input.nextLine();
        System.out.print("Masukkan email: ");
        String email = input.nextLine();

        User user = new User(username, email);
        user.login();

        // Input menu
        System.out.print("Masukkan nama menu: ");
        String menuName = input.nextLine();
        System.out.print("Masukkan harga menu: ");
        double price = input.nextDouble();
        input.nextLine(); // Bersihkan newline

        Menu menu = new Menu(menuName, price);
        menu.displayInfo();

        // Input order ID
        System.out.print("Masukkan ID pesanan: ");
        String orderId = input.nextLine();

        Order order = new Order(orderId, menu);
        order.login(); // Method override
        order.placeOrder();
    }
}

