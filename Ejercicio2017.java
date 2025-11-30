import java.util.Scanner;
public class Ejercicio2017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("¿Cuántos atletas deseas registrar? ");
        n = sc.nextInt();
        sc.nextLine();

        String[][] datos = new String[n][4]; 
        double mejorTiempo = 999999;
        int mejorAtleta = 0;

        for(int i = 0; i < n; i++){
            System.out.println("\nAtleta " + (i+1));

            System.out.print("Nombre: ");
            datos[i][0] = sc.nextLine();

            System.out.print("Apellido: ");
            datos[i][1] = sc.nextLine();

            System.out.print("Especialidad: ");
            datos[i][2] = sc.nextLine();

            System.out.print("Tiempo (segundos): ");
            datos[i][3] = sc.nextLine();

            double tiempo = Double.parseDouble(datos[i][3]);
            if(tiempo < mejorTiempo){
                mejorTiempo = tiempo;
                mejorAtleta = i;
            }
        }

        System.out.println("\nTabla de atletas:");
        System.out.println("Nombre   Apellido   Especialidad   Tiempo");
        for(int i = 0; i < n; i++){
            System.out.println(datos[i][0] + "   " + datos[i][1] + "   " + datos[i][2] + "   " + datos[i][3]);
        }

        System.out.println("\nMejor tiempo: " + datos[mejorAtleta][0] + " " +
                           datos[mejorAtleta][1] + " con " + mejorTiempo + " segundos.");
    }
}
