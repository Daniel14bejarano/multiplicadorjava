/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.multiplicarnumeros;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class MultiplicarNumeros {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a,b;
        System.out.println("Ingrese el primer numero");
        a= sc.nextInt();
        
        System.out.println("Ingrese el segundo numero");
        b= sc.nextInt();
        
        int c= a*b;
        System.out.println("= " + c);
        
    }
}
