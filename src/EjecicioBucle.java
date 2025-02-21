import java.util.Scanner;

/**
 * Solicita al usuario su nombre, y repetidamente, preguntale cuanto dinero tiene. En momento que tecle -1, el
 * programa saldrá y le mostrará por pantalla el total que ha indicado *
 * Pistas: usa un do-while
 */

public class EjecicioBucle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el nombre : ");
        String nombre = sc.nextLine();
        double dinero=0,contador=0;
        do{
            System.out.println("Ingresa el dinero, para salir ingresa -1 : ");
            dinero = sc.nextDouble();
            if (dinero!=-1){
                contador+=dinero;
            }
        }while(dinero!=-1);
        System.out.println(nombre + " Tienes "+  contador + "€ de dinero"   );
    }
}
