/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.grupo15.previa_1;

import com.grupo15.Exceptions.HandledException;
import java.text.MessageFormat;
import java.util.Scanner;
/**
 * Siglo
 * En la clase de historia de Juan con frecuencia se habla de los siglos en que ocurrieron ciertos
 * hechos. Esto hace que a Juan se le dificulte un poco ubicar los hechos en una línea de tiempo.
 * Su tarea es escribir un programa java que ayude a Juan.
 * 
 * A. Escriba un método java llamado siglo, el cual recibe como entrada el número de un año
 * (positivo), y retorna el número del siglo al que pertenece el año.
 * B. Escriba un método java llamado primer_anho, el cual recibe como entrada el número de
 * un siglo (positivo), y retorna el número del primer año de dicho siglo.
 * C. Complete el programa de forma que lea del teclado un valor n correspondiente a un año,
 * e imprima en pantalla el número del siglo al que pertenece el año n y el primer año de
 * dicho siglo. El programa debe usar los métodos creados en los literales a y b.
 * 
 * @author Oscar A. Peña C.
 */
public class Previa_1 {
    private static String OUT_OF_RANGE_EXCEPTION = "EXCEPCIÓN FUERA DE RANGO";
    public static void main(String[] args) throws HandledException  {
        int numero;
        System.out.println("Bienvenido al programa");
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Digite un año");
        try {
            numero=leer.nextInt();
            int s = siglo(numero);
            int pa = primer_anho(s);
            System.out.println(MessageFormat.format("El siglo correspondiente es {0}",s));
            System.out.println(MessageFormat.format("El primer año de este siglo es {0}",pa));
        
        } catch (HandledException e) {
            System.out.println("Code: "+e.getCode()+" Exception Message : "+e.getMessage());
        }
    }
    
    public static int siglo(int anho) throws HandledException {
        if(anho < 0 ) {
            throw new HandledException(OUT_OF_RANGE_EXCEPTION,MessageFormat.format("El año {0} no puede ser negativo",anho));
        }
        return anho/100 + 1;
    }
    public static int primer_anho(int siglo) throws HandledException {
        if(siglo < 1 ) {
            throw new HandledException(OUT_OF_RANGE_EXCEPTION,MessageFormat.format("El siglo {0} no puede ser menor a 1",siglo));
        }
        return (siglo - 1) * 100 + 1; 
    }
}
