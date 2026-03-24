import java.util.Scanner;

public class DemoPabellonCirujia {
    public static void main(String[] args) {
        Scanner tcld = new Scanner(System.in);

        //Creacion de arreglo
        PabellonCirujia[] cirugias = new PabellonCirujia[6];

        System.out.println("--- INGRESO DE DATOS ---");
        for (int i = 0; i < cirugias.length; i++) {
            System.out.println("Pabellon " + (i + 1) + ":");

            System.out.print("Numero: ");
            int numero = Integer.parseInt(tcld.nextLine());

            System.out.print("Especialidad: ");
            String especialidad = tcld.nextLine();

            cirugias[i] = new PabellonCirujia(numero, especialidad);
        }

        //Determinar si hay posiciones pares
        for (int i = 0; i < cirugias.length; i++) {
            if ((i + 1) % 2 == 0) {
                cirugias[i].setEstado(Estado.OCUPADO);
            }
        }

        System.out.println("\n--- LISTA DE PABELLONES ---");
        for (PabellonCirujia pc : cirugias) {
            System.out.println(pc.toString());
        }

        //Comparar si las cirujias son los iguales
        System.out.println("\n--- REPORTE DE REPETIDOS ---");
        boolean hayRepetidos = false;

        for (int i = 0; i < cirugias.length; i++) {
            for (int j = i + 1; j < cirugias.length; j++) {
                if (cirugias[i].equals(cirugias[j])) {
                    System.out.println("Los pabellones son iguales");
                    hayRepetidos = true;
                }
            }
        }

        if (!hayRepetidos) {
            System.out.println("No hay pabellones repetidos");
        }
    }
}