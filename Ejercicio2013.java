import java.util.Scanner;

public class Ejercicio2013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] alumnos = new int[3][4];

        for(int i = 1; i <= 12; i++){
            System.out.println("Estudiante " + i);
            System.out.print("Nivel (0=básico, 1=medio, 2=perfeccionamiento): ");
            int nivel = sc.nextInt();
            System.out.print("Idioma (0=Inglés, 1=Francés, 2=Alemán, 3=Ruso): ");
            int idioma = sc.nextInt();

            alumnos[nivel][idioma]++;
        }

        System.out.println("\nMatriz final:");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++){
                System.out.print(alumnos[i][j] + " ");
            }
            System.out.println();
        }
    }
}
