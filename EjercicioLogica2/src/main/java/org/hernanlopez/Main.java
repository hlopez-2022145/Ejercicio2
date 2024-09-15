package org.hernanlopez;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una oracion: ");
        String oracion = scanner.nextLine();

        System.out.println("Ingrese la palabra a buscar: ");
        String buscar = scanner.nextLine();

        int contador = 0;
        int leerParrafo = oracion.length();
        int buscarTexto = buscar.length() ;

        for(int i = 0; i < leerParrafo - buscarTexto;i++){
            int num = i;
            boolean encontrar = true;
            //iteramos para comparar cada caracter que buscamos
            for(int j = 0; j < buscarTexto ; j++){
                //verificamos si hay una coincidencia si no encontrar se vuelve false
                if (oracion.charAt(num++) != buscar.charAt(j)){
                    encontrar = false;
                    break;
                }
            }
            //si encontramos una coincidencia aumentamos el contador
            if (encontrar){
                contador++;
            }
        }
        System.out.println("La cantidad de palabras: " + contador);

    }
}