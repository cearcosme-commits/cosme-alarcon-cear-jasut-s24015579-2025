import java.util.Scanner;
public class Ejercicio203{
public static void main (String args []){
	Scanner sc =new Scanner(System.in);
	int opcion;
	double adeudo=1000;
	String continuar="si";
	
	while(continuar.equalsIgnoreCase("si")){
		System.out.println("bienbenido");
		System.out.println("1. consulta");
		System.out.println("2. pago del mes ");
		System.out.println("3. pago de adeudo");
		System.out.println("4. salir");
		System.out.println("eligue una opcion");
		opcion=sc.nextInt();
if(opcion==1){
	System.out.println("Su adeudo actual es : $" + adeudo);
}else if(opcion == 2){
	System.out.println("pagoel mes: $" + adeudo);
}else if(opcion == 3){
	System.out.println("Adeudo total es: $" + adeudo);
}else if(opcion == 4){
	System.out.println("¡Gracias por usar el sistema!");
	break;
}
	System.out.println("¿Desea continuar? (si/no): ");
	continuar=sc.next();
}
System.out.println("Hasta luego y lindo dia ");
	}
}
