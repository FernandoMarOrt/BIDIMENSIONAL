/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraybidimensionales;

import java.util.Scanner;

/**
 *
 * @author fer
 */
public class ejercicio19 {

    public static void main(String[] args) {

        boolean[][] asientos = new boolean[25][4];

        Scanner teclado = new Scanner(System.in);

        int opcion;

        //Relleno todo el array a true ya que significara
        for (int i = 0; i < asientos.length; i++) {

            for (int j = 0; j < asientos[i].length; j++) {

                asientos[i][j] = true;

            }

        }

        int fila;
        int asiento;

        do {

            System.out.println("""
                           Selecciona una de estas opciones por favor:
                           1.Reservar asientos
                           2.Cancelar asientos
                           3.Salir
                           """);

            opcion = teclado.nextInt();

            switch (opcion) {

                case 1:

                    System.out.println("Ha elegido reservar un asiento");
                    System.out.println("");

                    System.out.println("Dime una fila");
                    fila = teclado.nextInt();

                    System.out.println("Dime un asiento de la fila: " + fila);
                    asiento = teclado.nextInt();

                    if(asientos[fila][asiento] == false) {
                        
                        System.out.println("Ese asiento esta ocupado");
                        System.out.println("");
                        
                        
                        
                    } else {
                        
                        asientos[fila][asiento] = false;
                        System.out.println("Su asiento se ha reservado correctamente");
                        
                        System.out.println("");
                    }

                    break;

                case 2:

                    System.out.println("Ha elegido cancelar un asiento");
                    System.out.println("");
                    
                    System.out.println("Dime una fila");
                    fila = teclado.nextInt();

                    System.out.println("Dime un asiento de la fila: " + fila);
                    asiento = teclado.nextInt();
                    
                    if(asientos[fila][asiento] == true) {
                        
                        System.out.println("Ese asiento no esta reservado");
                        
                        System.out.println("");
                        
                    } else {
                        
                        asientos[fila][asiento] = true;
                        System.out.println("Se ha cancelado correctamente su asiento");
                        
                        System.out.println("");
                        
                    }
                    

                    break;

            }

        } while (opcion != 3);

    }

}
