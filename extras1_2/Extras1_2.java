/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extras1_2;

import java.util.Scanner;

/**
 *
 * @author oyagualendara
 */
public class Extras1_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*calcular o area de un circulo pedindo o valor do radio por teclado utilizando a libreria math tanto para PI como para r2*/
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        float rad, area;
        System.out.println("Dime el radio del circulo: ");
        rad = entrada.nextFloat();
System.out.println("El area del circulo con radio: "+rad+" es :"+(Math.PI*Math.pow(rad, 2)));
    }
    
}
