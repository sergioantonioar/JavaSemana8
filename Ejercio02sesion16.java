/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana8;

import java.util.Scanner;

/**
 *
 * @author sergio
 */
public class Ejercio02sesion16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("Ingrese un numero entero positivo: ");
            n = sc.nextInt();
        } while (n <= 0);

        int a = 1;
        int b = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int aux = a;
            a = b;
            b = aux + b;
        }
        System.out.println("");

    }
}
