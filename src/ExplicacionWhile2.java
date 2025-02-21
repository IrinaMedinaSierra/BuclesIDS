/*
En ocaciones es necesario controlar la condición con lo llamado contador, que indique
las veces que se repetira el bucle
Ejemplo:
Solicita 10 notas de alumnos y muestra la media

Asegurar puede entrar al bucle y que pueda salir.
 */

import java.util.Scanner;
public class ExplicacionWhile2 {
    public static void main(String[] args) {
        byte contador=1;
        byte notas=0;
        double mediaNotas=0;
        Scanner input = new Scanner(System.in);
        while(contador<=10){
            System.out.println("Digite sua nota "+ contador+":");
            notas+= input.nextByte(); //sumo en notas cada una de ellas
            contador++;
        }
        //el calculo lo hacemos fuera del bucle...
        mediaNotas=(double) notas/10;
        System.out.println("Media das notas: "+mediaNotas);
    }
}
