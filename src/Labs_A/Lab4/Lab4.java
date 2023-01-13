/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Labs_A.Lab4;

import java.util.*;
/**
 *
 * @author User
 */
public class Lab4 {

    /**
     * @param args the command line arguments
     * C11 = 3 (Визначити клас літак, який складається як мінімум з 5-и полів)
     */
    public static void main(String[] args) {
        Plane[] arr = {
            new Plane("Ан-225 «Мрія»", "Довжина: 84 м",  "Максимальна швидкість: 850 км/год", 61, 225),
            new Plane("Airbus A-380-800", "Довжина: 73.1 м", "Максимальна швидкість: 1020 км/год", 52, 380),
            new Plane("Boeing-747", "Довжина: 76.3 м", "Максимальна швидкість: 1102 км/год", 32, 747),
            new Plane("Ан-124 «Руслан»", "Довжина: 69.1 м", "Максимальна швидкість: 865 км/год", 43, 124),
            new Plane("Lockheed C-5 Galaxy", "Довжина: 75.53 м", "Максимальна швидкість: 922 км/год", 72, 5)};
        System.out.print("Літаки: ");
        
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i].getName() + "   ");
        }
        System.out.println("\n");
        System.out.println("   Відсортування літаків за спаданням залежно від кількості екіпажу:");
        Arrays.sort(arr, Comparator.comparingInt(Plane :: getAmount).reversed());
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i].getName() + " - " + arr[i].getAmount() + "\n");
        }
        System.out.println("   Відсортування літаків за зростанням залежно від номера:");
        Arrays.sort(arr, Comparator.comparingInt(Plane :: getNumber));
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i].getName() + " - " + arr[i].getNumber() + "\n");
        }
    }
}
    