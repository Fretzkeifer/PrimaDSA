/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProductCountSorter;

/**
 *
 * @author User
 */
public class Product {
    String productId;
    String name;
    String category;
    int quantity;
    
    public Product(String productId, String name, String Category, int quantity) {
        this.productId = productId;
        this.name = name;
        this.category = category;
        this.quantity = quantity;
    }
    
    public void display() {
        System.out.println(productId + "\t" + name + "\t\t"+ category + "\t\t" + quantity);
    }
}
