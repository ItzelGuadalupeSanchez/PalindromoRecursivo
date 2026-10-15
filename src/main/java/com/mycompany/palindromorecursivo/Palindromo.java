/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.palindromorecursivo;

/**
 *
 * @author Guadalupe
 */


public class Palindromo {

    // Método Wrapper: prepara y valida la palabra
        public static boolean verificar(String palabra) {
        // Validar si es nula
        if (palabra == null) {
            return false;
        }

        // Ignorar espacios y mayúsculas
        palabra = palabra.replace(" ", "").toLowerCase();

        return verificarRecursivo(palabra);
        }
        // Método recursivo
    public static boolean verificarRecursivo(String palabra) {

        // Caso base palabra vacía o de una letra
        if (palabra.length() <= 1) {
            return true;
        }

        // Comparar primera y última letra
        if (palabra.charAt(0) != palabra.charAt(palabra.length() - 1)) {
            return false;
        }

        // Volver a llamar al método sin la primera y última letra
       return verificarRecursivo(palabra.substring(1, palabra.length() - 1));
    }

    public static void main(String[] args) {

        // Pruebas del programa
        String[] palabras = {
            "reconocer", "radar","hola", "Anita lava la tina",  "",  "a","Oso"
        };

        for (String palabra : palabras) {
            System.out.println(palabra + ": " + verificar(palabra));
        }

        // Prueba con un valor nulo
        System.out.println("null: " + verificar(null));
    }
}
