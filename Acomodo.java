package com.upchiapas.evaluacion.models;

import java.util.Scanner;
import java.util.Stack;

public class Acomodo {
    Scanner palabra = new Scanner(System.in);

    String politecnica="";
    String cesar="";

    public void EntradaDeDatos(){
        System.out.println(" ");
        System.out.println("****BIENVENIDO A SU APP DE ACOMODO****");
        System.out.println("***Estructura de Datos***");
        System.out.println("**** Ingrese Los Datos Para Acomodar: **** ");//Nos pide lo que queremos acomodar
        String leerDato = palabra.next();

        Stack<Character> alan1 = new Stack<Character>(); //Aqui creamos las pilas
        Stack <Character> alan2 = new Stack<Character>();

        for ( int i=0; i<leerDato.length();i++){
            if(leerDato.charAt(i) == '+' || leerDato.charAt(i) == '-' || leerDato.charAt(i) == '/' || leerDato.charAt(i) == '*' ){
                alan1.push(leerDato.charAt(i));//Aqui nos

            }else {
                alan2.push(leerDato.charAt(i));
            }

        }
        while (!alan1.isEmpty()){
            politecnica = politecnica + alan1.pop();
        }

        while (!alan2.isEmpty()){
            cesar = cesar + alan2.pop();
        }
        System.out.println(" ");
        System.out.println("El Resultado Acomodado Es el Siguiente: " + politecnica + cesar);//Nos arroja el resultado

    }
}
