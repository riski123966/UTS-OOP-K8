/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pemesananmakanan2;

public class User {
    private String username;
    private String email;

    public User() {
        this.username = "Guest";
        this.email = "guest@example.com";
    }

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public void login() {
        System.out.println(username + " telah login.");
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }
}


