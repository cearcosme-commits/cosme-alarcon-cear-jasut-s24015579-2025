import java.util.Scanner;
public class Ejercicio204{
public static void main (String args []){
	Scanner sc =new Scanner(System.in);
	double saldo = 500;
	String seguir = "si";

while(seguir.equalsIgnoreCase("si")){
	System.out.println("Monto a retirar : ");
	double retiro = sc.nextDouble();

if(retiro <= saldo){
	saldo -=retiro;
	System.out.println("retiro exitoso. Saldo:$" + saldo);
}else{
	System.out.println("Saldo insuficiente.");
}
	System.out.println("¿Desea otro retiro? (si/no)");
	seguir = sc.next();
}
	System.out.println("Operacion terminada");
	}
}