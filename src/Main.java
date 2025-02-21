import java.util.Scanner;
//menu utulizando bucles y shitch case
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte opcion;
        do {
            System.out.println("Indica tu población: " +
                    "\n1->Tomelloso " +
                    "\n2->Alcázar " +
                    "\n3->La Solana" +
                    "\n4->Manzanares" +
                    "\n5->Miguel Esteban" +
                    "\n6->Mota del Cuervo" +
                    "\n Indica tu opción" +
                    "\n7->Salir");
            opcion = sc.nextByte();
            switch (opcion) {
                case 1 -> System.out.println("La ciudad del vino");
                case 2 -> System.out.println("Tenemos AVE");
                case 3 -> System.out.println("El pueblo más Bonito");
                case 4 -> System.out.println("No tiene nada! Solo Hospital");
                case 5 -> System.out.println("Delincuencia...ten cuidado");
                case 6 -> System.out.println("El balcón de la Mancha");
                case 7 -> System.out.println("Salida del sistema");
            }
        }while (opcion!=7);
        sc.close();
    }
}