import java.util.Scanner;
public class Ejercicio206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aprobados = 0, reprobados = 0;
        int suma = 0;

        for(int i = 1; i <= 5; i++){
            System.out.print("Calificación " + i + ": ");
            int cal = sc.nextInt();
            suma += cal;

            if(cal >= 6) aprobados++;
            else reprobados++;
        }

        double promedio = suma / 5.0;

        System.out.println("Aprobados: " + aprobados);
        System.out.println("Reprobados: " + reprobados);
        System.out.println("Promedio: " + promedio);
    }
}
