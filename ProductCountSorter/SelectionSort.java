/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProductCountSorter;

/**
 *
 * @author User
 */
public class SelectionSort {
    public static void selectionSort(Product[] arr){
        int n = arr.length;
        
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j].quantity < arr[minIndex].quantity) {
                    minIndex = j;
                }
            }
            
            Product temp = arr[minIndex];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}
