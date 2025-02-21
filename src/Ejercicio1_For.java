/*
Solita un número al usuario y muestra en pantalla desde 1 hasta el número ingresado.
Requisito: el numero es un entero positivo
1. Declaración del Scanner
2. Solicitar y leer el número
3. Crear el bucle for con número indicado en la condición
4. Dentro del bucle for, ir mostrando el valor de i
 */

import java.util.Scanner;

public class Ejercicio1_For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

/*
 * Implementar una aplicación que solicite al usuario un número comprendido entre el 1 y el 10, si se equivoca,
 * debes solicitarlo nuevamente (do - while)
 * Luego de leer correctamente ese número, mostrar por pantalla, la tabla de multiplicar de dicho número (for)
 * 1. DECLARAR SCANNER
 * 2. DECLARA -INICIALIZA EL NÚMERO
 * 3. SE CREA EL BUCLE DO (SOLICIAR Y LEER EL NUMERO) MIENTRAS -> WHILE (NUMERO<1 || NUMERO>10)
 * 4. BUCLE FOR DEL 1 AL 10- DENTRO SE MUESTRA EL VALOR DE i*número
 *
 */
/*
 * MUESTRA EN PANTALLA LOS NUMERO MÚLTIPLOS DE 7 DESDE 0 AL 100
 * IMPORTANTE....   i++  i--  i+=2   i+=10 i+=7
 * RECORDATORIO System.out.print(i+"-")
 */
for (int i =0; i<=100;i+=7){
    System.out.print( i + "-");
        }

    }
}
/* ******************** */


