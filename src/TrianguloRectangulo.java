/*
Pedir por consola un número y dibujar un triángulo rectángulo de n elementos de lado, utilizando para ello 🔹
Ejemplo para n=4 lados
🔹🔹🔹🔹
🔹🔹🔹
🔹🔹
🔹
 */


import java.util.Scanner;

public class TrianguloRectangulo {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Indica un número para mostrar el triangulo rectangulo");
        int num = input.nextInt(); //Leemos el número
        for (int filas=1; filas<=num;filas++){
            for (int colunas=filas; colunas<=num;colunas++){
                System.out.print("🔹"); //sin salto de línea
            }
            System.out.println();//salto de linea cuando cambie de fila
        }


    }
}
