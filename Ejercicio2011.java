import java.util.Scanner;
public class Ejercicio2011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[8];

        for(int i = 0; i < 8; i++){
            System.out.print("Número " + (i + 1) + ": ");
            nums[i] = sc.nextInt();
        }

        System.out.print("Número a buscar: ");
        int buscar = sc.nextInt();

        boolean existe = false;
        for(int n : nums){
            if(n == buscar){
                existe = true;
                break;
            }
        }

        if(existe) System.out.println("El número SÍ existe.");
        else System.out.println("El número NO existe.");
    }
}
