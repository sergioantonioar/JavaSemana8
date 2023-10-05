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
public class Sesion15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p, a, r, n;
        int termino;

        System.out.println("Ingrese el tipo de progresion: ");
        System.out.println("(1) aritmetica\n(2) geometrica:");
        p = sc.nextInt();

        System.out.println("Ingrese el primer termino: ");
        a = sc.nextInt();

        System.out.println("Ingrese la razon: ");
        r = sc.nextInt();

        System.out.println("Ingrese la cantidad de terminos: ");
        n = sc.nextInt();

        switch (p) {
            case 1 -> {
                System.out.println("Progresion Aritmetica");
                for (int i = 0; i < n; i++) {
                    termino = a + i * r;
                    System.out.println(termino);
                }
            }
            case 2 -> {
                System.out.println("Progresion Geometrica");
                for (int i = 0; i < n; i++) {
                    termino = (int) (a * (Math.pow(r, i)));
                    System.out.println(termino);
                }
            }
            default ->{
                System.out.println("ERROR: Valor fuera de rango");
            }
        }

    }
}
