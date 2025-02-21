
/*
Solicita al usuario un número y dibuja un triángulo con base=num y altura=n
Ejemplo num=4
       *
      * *
     * * *
    * * * *
 */


import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        System.out.println("Indique la base y altura del triangulo");
        int num=new Scanner(System.in).nextInt();

        for (int fila=1;fila<=num;fila++) {
                //tenemos que que tomar en cuenta los espacios necesarios
            for (int espacios=0;espacios<=num-fila;espacios++) {
                System.out.print(" ");
            }
            for (int signo=1;signo<=fila;signo++) {
                System.out.print("🎈");
            }
            System.out.println(); //salto de línea

        }





    }


}
