/**
** La Salida anticipada se puede ejecutar en cualquier bucle.
 * Interrumpir un bucle y salir si cumple alguna condición ...if - switch-case-> break;
*  Saltar una iteración, y qué bucle continue con su ejecución...se hace por medio de una condición,
 *  y se utiliza la sentencia -> continue;
 */

public class SalidasAnticipadas {
    public static void main(String[] args) {
        for (int i=0;i<10;i++){
           if (i%2==0) {//Mostrar los pares
               System.out.println("El valor de i es " + i);
           }else{
               System.out.println("Encontre un impar y me salgo del programador");
               break; //interrumpe el bucle
           }
        }

        for (int i=0;i<10;i++){
            if (i%2==0) {
                if (i==6) { //cuando i valga 6, lo salte
                    continue;
                }
                System.out.println("El valor de i es " + i); //no llega aqui si es i=6
            }
        }



    }
}
