/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pemesananmakanan2;

public class Order extends User {
    private String orderId;
    private Menu menu;

    public Order() {
        super();
        this.orderId = "ORD001";
        this.menu = new Menu("Default Menu", 0);
    }

    public Order(String orderId, Menu menu) {
        super(); // bisa diganti super(username, email);
        this.orderId = orderId;
        this.menu = menu;
    }

    @Override
    public void login() {
        System.out.println("Order oleh user dengan ID: " + getUsername() + " berhasil login.");
    }

    public void placeOrder() {
        System.out.println("Pesanan " + orderId + " untuk menu " + menu.getName() + " telah dibuat.");
    }
}

