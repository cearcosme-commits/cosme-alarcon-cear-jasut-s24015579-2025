import java.util.Scanner;
public class Ejercicio2016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] articulos = new String[3][3];
        String[] titulos = {"Artículo", "Talla", "Color"};

        for(int i = 0; i < 3; i++){
            System.out.println("\nArtículo " + (i+1));
            for(int j = 0; j < 3; j++){
                System.out.print(titulos[j] + ": ");
                articulos[i][j] = sc.nextLine();
            }
        }

        System.out.println("\nArtículo   Talla   Color");
        for(int i = 0; i < 3; i++){
            System.out.println(articulos[i][0] + "   " + articulos[i][1] + "   " + articulos[i][2]);
        }
    }
}
