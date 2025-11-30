public class Ejercicio208 {
    public static void main(String[] args) {
        double ahorro = 0;

        for(int mes = 1; mes <= 12; mes++){
            ahorro += 500;
            ahorro += ahorro * 0.09;
            System.out.println("Mes " + mes + ": $" + ahorro);
        }

        System.out.println("Total ahorrado en el año: $" + ahorro);
    }
}
