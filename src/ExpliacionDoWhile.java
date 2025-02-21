import java.util.Scanner;

/*
Bucle Do-While
Sintaxis
do{
    Bloque de instrucciones
}while(condicion);
*** Se ejecuta al menos una vez ***
*/
public class ExpliacionDoWhile {
    public static void main(String[] args) {
        int edad=100;
        Scanner input = new Scanner(System.in);
        do{ //ejecuta este bloque de instrucciones
            System.out.println("Digite sua edad:");
            edad = input.nextInt();
        }while(edad<18); //mientas se cumpla esta condicion
        System.out.println("La edad introducida es: "+edad);
    }
}
