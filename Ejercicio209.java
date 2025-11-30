import java.util.Scanner;
public class Ejercicio209 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] cal = new double[6];
        double suma = 0;

        for(int i = 0; i < 6; i++){
            System.out.print("Calificación " + (i + 1) + ": ");
            cal[i] = sc.nextDouble();
            suma += cal[i];
        }

        double prom = suma / 6;

        System.out.println("Calificaciones:");
        for(double c : cal){
            System.out.println(c);
        }

        System.out.println("Promedio del grupo: " + prom);
    }
}
