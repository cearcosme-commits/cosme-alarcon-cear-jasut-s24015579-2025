import java.util.Scanner;
public class Ejercicio2014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] empleados = new String[4];
        double[][] sueldos = new double[4][3];
        double[] acumulados = new double[4];

        for(int i = 0; i < 4; i++){
            System.out.print("Nombre del empleado " + (i+1) + ": ");
            empleados[i] = sc.nextLine();

            for(int j = 0; j < 3; j++){
                System.out.print("Sueldo del mes " + (j+1) + ": ");
                sueldos[i][j] = sc.nextDouble();
                acumulados[i] += sueldos[i][j];
            }
            sc.nextLine();        }
        double totalPagado = 0;
        for(double ac : acumulados){
            totalPagado += ac;
        }

        double mayor = acumulados[0];
        String nombreMayor = empleados[0];

        for(int i = 1; i < 4; i++){
            if(acumulados[i] > mayor){
                mayor = acumulados[i];
                nombreMayor = empleados[i];
            }
        }

        System.out.println("\nTotal pagado en 3 meses: $" + totalPagado);
        System.out.println("Empleado con mayor ingreso: " + nombreMayor + " ($" + mayor + ")");
    }
}
