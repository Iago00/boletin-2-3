/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg2.pkg3;

import java.util.Scanner;

/**
 *
 * @author ipampillonvieitez
 */
public class Boletin23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int billetes100,billetes20, billetes5, monedas, cantidad;
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("introduzca billetes de 100");
        billetes100 = sc.nextInt();
        cantidad = billetes100*100;
        System.out.println("introducir billetes de 20");
        billetes20 = sc.nextInt();
        cantidad = cantidad +billetes20*20;
        System.out.println("introducir billetes de 5");
        billetes5 = sc.nextInt();
        cantidad = cantidad +billetes5*5;
        System.out.println("introducir monedas");
        monedas = sc.nextInt();
        cantidad = cantidad + monedas;
        System.out.println("importe = " +cantidad);
        
        
        
        
    }
    
}
