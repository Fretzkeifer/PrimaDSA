/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProductCountSorter;

/**
 *
 * @author User
 */
public class Test {
    public static void main(String[] args) {
        Product[] products = new Product[8];
        products[0] = new Product("P001","Laptop","Electronics", 15);
        products[1] = new Product("P002","Mouse","Electronics", 120);
        products[2] = new Product("P003","Notebook","Stationary", 45);
        products[3] = new Product("P004","Pen","Stationary", 200);
        products[4] = new Product("P005","Chair","Furniture", 25);
        products[5] = new Product("P006","Table","Furniture", 10);
        products[6] = new Product("P007","Coffee","Grocery", 60);
        products[7] = new Product("P008","Water Bottle","Grocery", 5);
        
        System.out.println("=== BEFORE SORTING ===");
        System.out.printf("ID\tName\t\tcategory\tQty");
        for (int i = 0; i < products.length; i++) {
            products[i].display();
        }
        SelectionSort.selectionSort(products);
        
        System.out.println("\n=== TOP 3 LOWEST QUANTITY ===");
        System.out.println("ID\tName\t\tCategory\tQrt");
        for (int i = 0; i < products.length; i++) {
            products[i].display();
        }
    }
}
