import java.util.Scanner;

/*
Bucle while ->Sintaxis
while(condicion){
        Bloque de instrucciones -> salida de pantallas, if-else,switch, bucles
}

 */
public class ExplicacionWhile {
    public static void mainº(String[] args) {
        //Solicita la edad, hasta que escribas -1
        int edad=0;
        Scanner sc = new Scanner(System.in);
        while(edad>=0){ //se repetira hasta que el usuario escriba -1
            System.out.println("Ingresa su edad:");
            edad=sc.nextInt();
            if (edad>=18){
                System.out.println("Eres mayor de edad");
            }
            else if (edad>=0){
                System.out.println("Eres menor de edad");
            }   else{
                System.out.println("Edad no válida");
            }
        }
        sc.close();//cerrar el scanner
    }
}
