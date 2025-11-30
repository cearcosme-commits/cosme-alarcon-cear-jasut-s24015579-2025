import java.util.Scanner;
public class Ejercicio2012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] ventas = new double[7];
        double total = 0;
        double mayor = 0;
        int diaMayor = 0;

        for(int i = 0; i < 7; i++){
            System.out.print("Venta día " + (i + 1) + ": ");
            ventas[i] = sc.nextDouble();
            total += ventas[i];

            if(ventas[i] > mayor){
                mayor = ventas[i];
                diaMayor = i + 1;
            }
        }

        System.out.println("Venta total: $" + total);
        System.out.println("Día con mayor venta: Día " + diaMayor + " ($" + mayor + ")");
    }
}
