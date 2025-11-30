import java.util.Scanner;
public class Ejercicio2015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] paises = new String[4];
        double[][] temps = new double[4][3];
        double[] promedios = new double[4];

        for(int i = 0; i < 4; i++){
            System.out.print("Nombre del país " + (i+1) + ": ");
            paises[i] = sc.nextLine();

            for(int j = 0; j < 3; j++){
                System.out.print("Temperatura del mes " + (j+1) + ": ");
                temps[i][j] = sc.nextDouble();
                promedios[i] += temps[i][j];
            }
            promedios[i] /= 3;
            sc.nextLine();
        }

        System.out.println("\nTemperaturas ingresadas:");
        for(int i = 0; i < 4; i++){
            System.out.print(paises[i] + ": ");
            for(int j = 0; j < 3; j++){
                System.out.print(temps[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nTemperatura media trimestral:");
        double mayor = promedios[0];
        String paisMayor = paises[0];

        for(int i = 0; i < 4; i++){
            System.out.println(paises[i] + ": " + promedios[i]);

            if(promedios[i] > mayor){
                mayor = promedios[i];
                paisMayor = paises[i];
            }
        }

        System.out.println("\nPaís con mayor temperatura media: " + paisMayor);
    }
}
