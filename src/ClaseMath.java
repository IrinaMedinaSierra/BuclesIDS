import java.util.Scanner;

public class ClaseMath {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Indique un número");
        int numero1 = input.nextInt();
        System.out.println("Indique otro numero");
        int numero2 = input.nextInt();
        System.out.println("Math.max->" + Math.max(numero1, numero2));
        System.out.println("Math.min->" + Math.min(numero1, numero2));
        System.out.println("Raiz cuadrada numero1" + Math.sqrt(numero1));
        System.out.println("Raiz cuadrada numero2" + Math.sqrt(numero2));
        System.out.println("Valor absoluto numero1" + Math.abs(numero1));
        System.out.println("Valor absoluto numero2" + Math.abs(numero2));
        //Muy usado
        System.out.println("Exponencial Math.pow(numero1, numero2)" + Math.pow(numero1, numero2));
        //Random
        //Ejemplo 1: Mostrar un numero aletorio del 1 al 10
         int aleatorio=(int) (Math.random()*10);
        System.out.println("☎Aleatorio es \uD83D\uDE0A->"+aleatorio);










    }
}
